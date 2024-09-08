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
public class Autor {
    private int idAutor;
    private String nomeAutor;

    public Autor() {
        this.idAutor = 0;
        this.nomeAutor = "";
    }
    
    public Autor(int idAutor, String nomeAutor) {
        this.idAutor = idAutor;
        this.nomeAutor = nomeAutor;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.idAutor;
        hash = 71 * hash + Objects.hashCode(this.nomeAutor);
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
        final Autor other = (Autor) obj;
        if (this.idAutor != other.idAutor) {
            return false;
        }
        return Objects.equals(this.nomeAutor, other.nomeAutor);
    }

    @Override
    public String toString() {
        return "Autor:\n" + "ID: " + idAutor + "\nNome: " + nomeAutor + '\n';
    }
    
}
