/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biblioteca.dao;

import br.com.biblioteca.model.Editora;
import br.com.biblioteca.utils.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FEF
 */
public class EditoraDAO implements GenericDAO {

    private Connection conexao;

    public EditoraDAO() throws Exception {
        conexao = SingleConnection.getConnection();
    }

    @Override
    public Boolean cadastrar(Object objeto) {

        Editora aEditora = (Editora) objeto;
        Boolean retorno = false;

        if (aEditora.getIdEditora() == 0) {
            retorno = this.inserir(aEditora);
        } else {
            retorno = this.alterar(aEditora);
        }
        return retorno;
    }

    @Override
    public Boolean inserir(Object objeto) {
        Editora aEditora = (Editora) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into editora(nome_editora) values(?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aEditora.getNomeEditora());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try {
                System.out.println("Problemas ao cadastrar a Editora! Erro: " + ex.getMessage());
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
        Editora aEditora = (Editora) objeto;
        PreparedStatement stmt = null;
        String sql = "update editora set nome_editora=? where id_editora=?";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aEditora.getNomeEditora());
            stmt.setInt(2, aEditora.getIdEditora());
            stmt.execute();
            conexao.commit();
            System.out.println("Editora Alterada com Sucesso!");
            return true;
            
        }catch (Exception ex){
            try {
                System.out.println("Problemas ao ALTERAR a Editora!Erro: "+ex.getMessage());
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
        int idEditora = numero;
        PreparedStatement stmt = null;
        
        String sql = "delete from editora where id_editora=?";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idEditora);
            stmt.execute();
            conexao.commit();
            System.out.println("Editora Excluida com Sucesso!");
            return true;
            
        }catch(Exception ex){
            System.out.println("Problemas ao excluir Ediotra! Erro"+ ex.getMessage());
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
        int idEditora = numero;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Editora aEditora = null;
        String sql = "select * from editora where id_editora=?";
        
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idEditora);
            rs=stmt.executeQuery();
            while(rs.next()){
                aEditora = new Editora();
                aEditora.setIdEditora(rs.getInt("id_editora"));
                aEditora.setNomeEditora(rs.getString("nome_editora"));
            }
            return aEditora;
        }catch(Exception ex){
            System.out.println("Problemas ao CARREGAR Editora! Erro"+ ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from editora order by id_editora";

        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Editora aEditora = new Editora();
                aEditora.setIdEditora(rs.getInt("id_editora"));
                aEditora.setNomeEditora(rs.getString("nome_editora"));
                resultado.add(aEditora);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao Listar Editora! Erro: "
                    + ex.getMessage());
        }

        return resultado;
    }

}
