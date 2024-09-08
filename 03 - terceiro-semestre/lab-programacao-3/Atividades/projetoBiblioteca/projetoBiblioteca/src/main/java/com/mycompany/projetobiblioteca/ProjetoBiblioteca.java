package com.mycompany.projetobiblioteca;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import model.Livro;
import model.Biblioteca;

/**
 *
 * @author FELIPE
 */
public class ProjetoBiblioteca {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("Projeto de biblioteca em Java");
        int opcao = 0;

        do {
            System.out.println("1 - Adicionar um livro");
            System.out.println("2 - Retirar um livro");
            System.out.println("3 - Devolver um livro");
            System.out.println("4 - Exibir livros disponiveis");
            System.out.println("9 - Para encerrar o programa");
            opcao = ler.nextInt();
            if (opcao == 1) {
                System.out.println("Informe os os dados do livro: ");
                biblioteca.AdicionaLivro();
            } else if (opcao == 2) {
                System.out.println("Qual livro deseja retirar?");
                biblioteca.EmprestarLivro(ler.next());
            } else if (opcao == 3) {
                biblioteca.DevolverLivro(ler.next());
            } else if (opcao == 4) {
                biblioteca.ExibirInfo();
            }
        } while (opcao != 9);

    }

}
