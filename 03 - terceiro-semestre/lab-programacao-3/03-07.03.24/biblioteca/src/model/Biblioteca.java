package model;

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca extends Livro {
    private ArrayList<Livro> livros = new ArrayList<>();;

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro() {
        Scanner ler = new Scanner(System.in);

        Livro dadosLivro = new Livro();

        System.out.println("Digite o Titulo do Livro:");
        dadosLivro.setTitulo(ler.next());

        System.out.println("Digite o Autor do Livro:");
        dadosLivro.setAutor(ler.next());

        System.out.println("Digite o Numeros de Páginas:");
        dadosLivro.setNumero_de_paginas(ler.nextInt());

        dadosLivro.setFlag(true);

        livros.add(dadosLivro);

        setLivros(livros);

    }

    public void emprestarLivro(String Titulo) {
        for (Livro livro : livros) {
            System.out.println(livro);
            if (livro.getTitulo().equals(Titulo)) {
                System.out.println("LIVRO EMPRESTADO");
                livro.setFlag(empresta());
            }
        }
        
    }

    public void devolverLivro(String Titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(Titulo)) {
                System.out.println("LIVRO DEVOLVIDO");
                livro.setFlag(devolve());
            }
        }
        
    }

    public void exibirLivrosDisponivel() {
        for (Livro livro : livros) {
            if (livro.getFlag() == true) {
                System.out.println("\n"+livro+"\n");

            }
        }
        
    }


}
