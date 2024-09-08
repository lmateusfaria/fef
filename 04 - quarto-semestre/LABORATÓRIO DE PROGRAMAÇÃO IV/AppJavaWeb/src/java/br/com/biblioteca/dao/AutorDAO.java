/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biblioteca.dao;

import br.com.biblioteca.model.Autor;
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
public class AutorDAO implements GenericDAO {
    
    private Connection conexao;

    
    public AutorDAO() throws Exception {
        conexao = SingleConnection.getConnection();
    }


    @Override
    public Boolean cadastrar(Object objeto) {
        
        Autor oAutor = (Autor) objeto;
        Boolean retorno = false;

        if (oAutor.getIdAutor()== 0) {
            retorno = this.inserir(oAutor);
        } else {
            retorno = this.alterar(oAutor);
        }
        return retorno;}

    @Override
    public Boolean inserir(Object objeto) {
        Autor oAutor = (Autor) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into autor(nome) values(?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oAutor.getNomeAutor());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao cadastrar o Autor! Erro: " + ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Boolean alterar(Object objeto) {
        Autor oAutor = (Autor) objeto;
        PreparedStatement stmt = null;
        String sql = "update autor set nome=? where id_autor=?";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oAutor.getNomeAutor());
            stmt.setInt(2, oAutor.getIdAutor());
            stmt.execute();
            conexao.commit();
            System.out.println("Autor Alterado com Sucesso!");
            return true;
            
        }catch (Exception ex){
            try {
                System.out.println("Problemas ao ALTERAR o Autor !Erro: "+ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            }catch(SQLException e){
                System.out.println("Erro:"+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Boolean excluir(int numero) {
        int idAutor = numero;
        PreparedStatement stmt = null;
        
        String sql = "delete from autor where id_autor=?";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idAutor);
            stmt.execute();
            conexao.commit();
            System.out.println("Autor excluído com Sucesso!");
            return true;
            
        }catch(Exception ex){
            System.out.println("Problemas ao excluir Autor! Erro"+ ex.getMessage());
            try{
                conexao.rollback();
            }catch(SQLException e){
                System.out.println("Erro rollback: "+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Object carregar(int numero) {
        int idAutor = numero;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Autor oAutor = null;
        String sql = "select * from autor where id_autor=?";
        
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idAutor);
            rs=stmt.executeQuery();
            while(rs.next()){
                oAutor = new Autor();
                oAutor.setIdAutor(rs.getInt("id_autor"));
                oAutor.setNomeAutor(rs.getString("nome"));
            }
            return oAutor;
        }catch(Exception ex){
            System.out.println("Problemas ao CARREGAR Autor! Erro"+ ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from autor order by id_autor";

        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Autor oAutor = new Autor();
                oAutor.setIdAutor(rs.getInt("id_autor"));
                oAutor.setNomeAutor(rs.getString("nome"));
                resultado.add(oAutor);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao Listar Autor! Erro: "
                    + ex.getMessage());
        }

        return resultado;
    }
    
}
