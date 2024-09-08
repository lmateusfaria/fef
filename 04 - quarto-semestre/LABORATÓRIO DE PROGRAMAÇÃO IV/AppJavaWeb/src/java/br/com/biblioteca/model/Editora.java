/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biblioteca.model;

import java.util.Objects;

/**
 *
 * @author FEF
 */
public class Editora {
    private int idEditora;
    private String nomeEditora;
    
    
    public Editora() {
        this.idEditora = 0;
        this.nomeEditora = "";
    }
    
    public Editora(int idEditora, String nomeEditora) {
        this.idEditora = idEditora;
        this.nomeEditora = nomeEditora;
    }

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idEditora;
        hash = 67 * hash + Objects.hashCode(this.nomeEditora);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Editora other = (Editora) obj;
        if (this.idEditora != other.idEditora) {
            return false;
        }
        return Objects.equals(this.nomeEditora, other.nomeEditora);
    }

    @Override
    public String toString() {
        return "Editora:\n" + "ID: " + idEditora + "\nNome: " + nomeEditora + '\n';
    }
    
    
}
