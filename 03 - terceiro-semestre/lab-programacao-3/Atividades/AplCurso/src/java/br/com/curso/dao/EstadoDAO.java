/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.curso.dao;

import br.com.curso.model.Estado;
import br.com.curso.utils.SingleConnection;
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
public class EstadoDAO implements GenericDAO {

    private Connection conexao;
    
    public EstadoDAO() throws Exception{
        conexao = SingleConnection.getConnection();
    }
    
    @Override
    public Boolean cadastrar(Object objeto) {
        Estado oEstado = (Estado) objeto;
        Boolean retorno = false;
        
        if (oEstado.getIdEstado() == 0){
            retorno = this.inserir(oEstado);
        }else{
            retorno = this.alterar(oEstado);
        }
        
        return retorno;
    }

    @Override
    public Boolean inserir(Object objeto) {
        
        Estado oEstado = (Estado) objeto;
        
        PreparedStatement stmt = null;
        
        String sql = "insert into estado (nomeestado,siglaestado) values(?,?)";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oEstado.getNomeEstado());
            stmt.setString(2, oEstado.getSiglaEstado());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try{
                System.out.println("Problemas ao CADASTRAR o Estado! Erro:"+ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            }catch (SQLException e) {
                System.out.println("Erro:"+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    
    }

    @Override
    public Boolean alterar(Object objeto) {
        Estado oEstado = (Estado) objeto;
        PreparedStatement stmt = null;
        String sql = "update estado set nomeestado=?,siglaestado=? where idestado=?";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oEstado.getNomeEstado());
            stmt.setString(2, oEstado.getSiglaEstado());
            stmt.setInt(3, oEstado.getIdEstado());
            stmt.execute();
            conexao.commit();
            System.out.println("Estado Alterado com Sucesso!");
            return true;
            
        }catch (Exception ex){
            try {
                System.out.println("Problemas ao ALTERAR o Estado!Erro: "+ex.getMessage());
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
        int idEstado = numero;
        PreparedStatement stmt = null;
        
        String sql = "delete from estado where idestado=?";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idEstado);
            stmt.execute();
            conexao.commit();
            System.out.println("Estado Deletado com Sucesso!");
            return true;
            
        }catch(Exception ex){
            System.out.println("Problemas ao excluir o Estado! Erro"+ ex.getMessage());
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
        int idEstado = numero;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Estado oEstado = null;
        String sql = "select * from estado where idEstado=?";
        
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idEstado);
            rs=stmt.executeQuery();
            while(rs.next()){
                oEstado = new Estado();
                oEstado.setIdEstado(rs.getInt("idEstado"));
                oEstado.setNomeEstado(rs.getString("nomeEstado"));
                oEstado.setSiglaEstado(rs.getString("siglaEstado"));
            }
            return oEstado;
        }catch(Exception ex){
            System.out.println("Problemas ao CARREGAR Estado! Erro"+ ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from estado order by idEstado";
        try{
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){
                Estado oEstado = new Estado();
                oEstado.setIdEstado(rs.getInt("idEstado"));
                oEstado.setNomeEstado(rs.getString("nomeEstado"));
                oEstado.setSiglaEstado(rs.getString("siglaEstado"));
                resultado.add(oEstado);
            }
        }catch (SQLException ex){
            System.out.println("Problema ao LISTAR Estado! Erro: "+ ex.getMessage());
        }
        return resultado;
    }
    
}
