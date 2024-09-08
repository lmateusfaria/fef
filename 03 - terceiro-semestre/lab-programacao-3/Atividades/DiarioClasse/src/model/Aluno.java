/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author jeffe
 */
public class Aluno {
    
    String nome;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;

    public Aluno() {
        this.nome="";
        this.nota1=0;
        this.nota2=0;
        this.nota3=0;
        this.nota4=0;
        this.media=0;
    }

    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4, double media) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + ", media=" + media + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.nota1) ^ (Double.doubleToLongBits(this.nota1) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.nota2) ^ (Double.doubleToLongBits(this.nota2) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.nota3) ^ (Double.doubleToLongBits(this.nota3) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.nota4) ^ (Double.doubleToLongBits(this.nota4) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.media) ^ (Double.doubleToLongBits(this.media) >>> 32));
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
        final Aluno other = (Aluno) obj;
        if (Double.doubleToLongBits(this.nota1) != Double.doubleToLongBits(other.nota1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nota2) != Double.doubleToLongBits(other.nota2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nota3) != Double.doubleToLongBits(other.nota3)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nota4) != Double.doubleToLongBits(other.nota4)) {
            return false;
        }
        if (Double.doubleToLongBits(this.media) != Double.doubleToLongBits(other.media)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    public void calcularMedia(){
        this.media = (this.nota1+this.nota2+this.nota3+this.nota4)/4;
    }
}
