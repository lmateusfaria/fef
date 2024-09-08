package com.mycompany.projetobiblioteca;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import model.Controle;
/**
 *
 * @author FELIPE
 */
public class ProjetoBiblioteca {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Controle> lista = new ArrayList<>();
        
        int opcao=0;
        
        do{
            System.out.println("1 - Adicionar um livro");
            System.out.println("");
            System.out.println(" - Listar livros");
            System.out.println(" - Verificar disponibilidade");
            System.out.println("9 - Sair do programa");
            opcao = ler.nextInt();
            
            if(opcao==1){
                Controle adiciona = new Controle();
                System.out.println("1 - Qual o titulo do livro?");
                adiciona.setNomeLivro(ler.next());
                System.out.println("2 - Qual o nome do autor?");
                adiciona.setNomeAutor(ler.next());
                System.out.println("3 - Quantas páginas tem o livro?");
                adiciona.setNumPagi(ler.nextDouble());
                System.out.println("4 - Qual a temática do livro?");
                adiciona.setTemaLivro(ler.next());
                lista.add(adiciona);
            } else if(opcao==2){
                for(Controle list: lista){
                    System.out.println(list.toString());
                }
            } else if(opcao==3){
               
            }
            
        }while (opcao != 9);
        
    }
}
