/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author ronan
 */
public class Contato {
    
    private String nome;
    private String celular;
    private String email;
    private double idade;

    public Contato() {
    }

    public Contato(String nome, String celular, String email, double idade) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.celular);
        hash = 13 * hash + Objects.hashCode(this.email);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.idade) ^ (Double.doubleToLongBits(this.idade) >>> 32));
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
        final Contato other = (Contato) obj;
        if (Double.doubleToLongBits(this.idade) != Double.doubleToLongBits(other.idade)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", celular=" + celular + ", email=" + email + ", idade=" + idade + '}';
    }
    
    
    
    
    
    
}
