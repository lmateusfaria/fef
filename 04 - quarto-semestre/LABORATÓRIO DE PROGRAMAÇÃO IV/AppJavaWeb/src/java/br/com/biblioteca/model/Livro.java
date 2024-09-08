/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.biblioteca.model;

import java.util.Objects;

/**
 *
 * @author LM
 */
public class Livro {
    private int idLivro;
    private String titulo;
    private String isbn;
    private String numeroPaginas;
    private String tipoCapa;
    private Editora editora;
    private Autor autor;

    public Livro() {
        this.idLivro = 0;
        this.titulo = "";
        this.isbn = "";
        this.numeroPaginas = "";
        this.tipoCapa = "";
        this.editora = new Editora();
        this.autor = new Autor();
    }
    
    public Livro(int idLivro, String titulo, String isbn, String numeroPaginas, String tipoCapa, Editora editora, Autor autor) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.tipoCapa = tipoCapa;
        this.editora = editora;
        this.autor = autor;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(String tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idLivro;
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + Objects.hashCode(this.isbn);
        hash = 59 * hash + Objects.hashCode(this.numeroPaginas);
        hash = 59 * hash + Objects.hashCode(this.tipoCapa);
        hash = 59 * hash + Objects.hashCode(this.editora);
        hash = 59 * hash + Objects.hashCode(this.autor);
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
        final Livro other = (Livro) obj;
        if (this.idLivro != other.idLivro) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.numeroPaginas, other.numeroPaginas)) {
            return false;
        }
        if (!Objects.equals(this.tipoCapa, other.tipoCapa)) {
            return false;
        }
        if (!Objects.equals(this.editora, other.editora)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    @Override
    public String toString() {
        return "Livro:\n" + "idLivro: " + idLivro + "\nTitulo: " + titulo + "\nISBN: " + isbn + "\nNº Páginas: " + numeroPaginas + "\nTipo de Capa: " + tipoCapa + "\nEditora: " + editora + "\nAutor: " + autor ;
    }
    
    
}
