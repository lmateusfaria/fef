/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.curso.dao;

import java.util.List;

/**
 *
 * @author FEF
 */
public interface GenericDAO {
    
    public Boolean cadastrar (Object object);
    public Boolean inserir (Object object);
    public Boolean alterar (Object object);
    public Boolean excluir (int numero);
    public Object carregar (int numero);
    public List<Object> listar();
    
}