package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author FELIPE
 */
public class Biblioteca extends Livro {

    private ArrayList<Livro> livros = new ArrayList<>();

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void AdicionaLivro() {
        Scanner ler = new Scanner(System.in);
        Livro adicionar = new Livro();

        System.out.println("Nome do livro: ");
        adicionar.setNomeLivro(ler.next());
        System.out.println("Nome do autor do livro");
        adicionar.setNomeAutor(ler.next());
        System.out.println("Número de páginas do livro: ");
        adicionar.setNumPagi(ler.nextDouble());
        System.out.println("Temática do livro: ");
        adicionar.setTemaLivro(ler.next());
        adicionar.setControleLivro(false);
        livros.add(adicionar);
        setLivros(livros);
    }

    public void EmprestarLivro(String nomeLivro) {
        for (Livro livros : livros) {
            if (livros.getNomeLivro().equals(nomeLivro)) {
                System.out.println("Livro disponivel!");
                livros.setControleLivro(emprestar());

            } else {
                System.out.println("Livro Indisponivel!");

            }
        }
    }

    public void DevolverLivro(String nomeLivro) {
        for (Livro livros : livros) {
            if (livros.getNomeLivro().equals(nomeLivro)) {
                System.out.println("Livro devolvido com sucesso!");
                livros.setControleLivro(devolver());

            }
        }
    }

    public void ExibirInfo() {
        for (Livro livro : livros) {
            if (livro.isControleLivro() == true) {
                System.out.println("\n" + livros + "\n");
            }
        }
    }
}
