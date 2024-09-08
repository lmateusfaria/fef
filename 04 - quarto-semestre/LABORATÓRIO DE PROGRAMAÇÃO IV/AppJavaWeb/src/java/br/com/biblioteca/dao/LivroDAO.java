/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biblioteca.dao;

import br.com.biblioteca.model.Autor;
import br.com.biblioteca.model.Editora;
import br.com.biblioteca.model.Livro;
import br.com.biblioteca.utils.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LM
 */
public class LivroDAO implements GenericDAO {

    private Connection conexao;

    public LivroDAO() throws Exception {
        conexao = SingleConnection.getConnection();
    }

    @Override
    public Boolean cadastrar(Object objeto) {
        Livro oLivro = (Livro) objeto;
        Boolean retorno = false;
        if (oLivro.getIdLivro() == 0) {
            retorno = this.inserir(oLivro);
        } else {
            retorno = this.alterar(oLivro);
        }
        return retorno;
    }

    @Override
    public Boolean inserir(Object objeto) {

        Livro oLivro = (Livro) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into livro(titulo,isbn,numero_paginas,tipo_capa,fk_id_editora,fk_id_autor) values(?,?,?,?,?,?)";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oLivro.getTitulo());
            stmt.setString(2, oLivro.getIsbn());
            stmt.setString(3, oLivro.getNumeroPaginas());
            stmt.setString(4, oLivro.getTipoCapa());

            stmt.setInt(5, oLivro.getEditora().getIdEditora());
            stmt.setInt(6, oLivro.getAutor().getIdAutor());

            stmt.execute();
            conexao.commit();
            System.out.println("Livro Inserido com Sucesso!");
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao INSERIR o Livro! Erro:" + ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro:" + e.getMessage());
                e.printStackTrace();
            }
            return false;
        }

    }

    @Override
    public Boolean alterar(Object objeto) {
        Livro oLivro = (Livro) objeto;
        PreparedStatement stmt = null;

        //String sql = "insert into livro(titulo,isbn,numero_paginas,tipo_capa,fk_id_editora,fk_id_autor) values(?,?,?,?,?,?)";
        String sql = "update livro set titulo=?,isbn=?,numero_paginas=?,tipo_capa=?,fk_id_editora=?,fk_id_autor=? where id_livro=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oLivro.getTitulo());
            stmt.setString(2, oLivro.getIsbn());
            stmt.setString(3, oLivro.getNumeroPaginas());
            stmt.setString(4, oLivro.getTipoCapa());

            stmt.setInt(5, oLivro.getEditora().getIdEditora());
            stmt.setInt(6, oLivro.getAutor().getIdAutor());
            stmt.setInt(7, oLivro.getIdLivro());
            
            stmt.execute();
            conexao.commit();
            System.out.println("Livro Alterado com Sucesso!");
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao ALTERAR o Livro!Erro: " + ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro:" + e.getMessage());
                e.printStackTrace();
            }
            return false;
        }

    }

    @Override
    public Boolean excluir(int numero) {
        int idLivro = numero;
        PreparedStatement stmt = null;

        String sql = "delete from livro where id_livro=?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idLivro);
            stmt.execute();
            conexao.commit();
            System.out.println("Livro excluído com Sucesso!");
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao excluir Livro! Erro" + ex.getMessage());
            try {
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro rollback: " + e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Object carregar(int numero) {
        int idLivro = numero;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Livro oLivro = null;
        String sql = "select * from livro where id_livro=?";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idLivro);
            rs = stmt.executeQuery();
            while (rs.next()) {
                oLivro = new Livro();
                oLivro.setIdLivro(rs.getInt("id_livro"));
                oLivro.setTitulo(rs.getString("titulo"));
                oLivro.setIsbn(rs.getString("isbn"));
                oLivro.setNumeroPaginas(rs.getString("numero_paginas"));
                oLivro.setTipoCapa(rs.getString("tipo_capa"));

                EditoraDAO aEditoraDAO = new EditoraDAO();
                oLivro.setEditora((Editora) aEditoraDAO.carregar(rs.getInt("fk_id_editora")));

                AutorDAO oAutorDAO = new AutorDAO();
                oLivro.setAutor((Autor) oAutorDAO.carregar(rs.getInt("fk_id_autor")));

            }
            return oLivro;
        } catch (Exception ex) {
            System.out.println("Problemas ao CARREGAR Livro! Erro" + ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from livro order by titulo";
        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Livro oLivro = new Livro();
                oLivro.setIdLivro(rs.getInt("id_livro"));
                oLivro.setTitulo(rs.getString("titulo"));
                oLivro.setIsbn(rs.getString("isbn"));
                oLivro.setNumeroPaginas(rs.getString("numero_paginas"));
                oLivro.setTipoCapa(rs.getString("tipo_capa"));

                EditoraDAO aEditoraDAO = null;
                AutorDAO oAutorDAO = null;

                try {
                    aEditoraDAO = new EditoraDAO();
                } catch (Exception ex) {
                    System.out.println("Erro ao buscar Editora! Erro" + ex.getMessage());
                    ex.printStackTrace();
                }

                try {
                    oAutorDAO = new AutorDAO();
                } catch (Exception ex) {
                    System.out.println("Erro ao buscar Autor! Erro" + ex.getMessage());
                    ex.printStackTrace();
                }

                oLivro.setEditora((Editora) aEditoraDAO.carregar(rs.getInt("fk_id_editora")));
                oLivro.setAutor((Autor) oAutorDAO.carregar(rs.getInt("fk_id_autor")));

                resultado.add(oLivro);
            }
        } catch (SQLException e) {
            System.out.println("Problema ao LISTAR Livro! Erro: " + e.getMessage());
        }
        return resultado;

    }

}
