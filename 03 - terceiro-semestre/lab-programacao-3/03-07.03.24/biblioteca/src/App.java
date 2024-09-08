import java.util.Scanner;

import model.Biblioteca;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Integer op = 0;

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("BIBLIOTECA JAVA");

        do {
            System.out.println("MENU");
            System.out.println("1 -> ADICIONAR NOVO LIVRO");
            System.out.println("2 -> EMPRESTAR LIVRO");
            System.out.println("3 -> DEVOLVER LIVRO");
            System.out.println("4 -> EXIBIR TODOS OS LIVROS DISPONIVEIS");
            op = ler.nextInt();
            if (op == 1) {
                System.out.println("[NOVO LIVRO]");
                biblioteca.adicionarLivro();
            } else if (op == 2) {
                System.out.println("PARA EMPRESTAR DIGITE O NOME DO LVRO:");
                biblioteca.emprestarLivro(ler.next());
            } else if (op == 3) {
                biblioteca.devolverLivro(ler.next());
            } else if (op == 4) {
                biblioteca.exibirLivrosDisponivel();
            }         
        } while (op == 1 || op == 2 || op == 3 || op == 4);

    }

}
