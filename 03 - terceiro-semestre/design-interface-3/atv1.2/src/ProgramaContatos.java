import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Contato;

public class ProgramaContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contato> listaContatos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar novo Contato");
            System.out.println("2 - Excluir um Contato");
            System.out.println("3 - Listar todos os contatos");
            System.out.println("4 - Calcular a média de idade de seus amigos");
            System.out.println("9 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarContato(scanner, listaContatos);
                    break;
                case 2:
                    excluirContato(scanner, listaContatos);
                    break;
                case 3:
                    listarContatos(listaContatos);
                    break;
                case 4:
                    calcularMediaIdade(listaContatos);
                    break;
                case 9:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 9);

        scanner.close();
    }

    private static void adicionarContato(Scanner scanner, List<Contato> listaContatos) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.next();

        System.out.print("Digite o celular do contato: ");
        String celular = scanner.next();

        System.out.print("Digite o email do contato: ");
        String email = scanner.next();

        System.out.print("Digite a idade do contato: ");
        double idade = scanner.nextDouble();

        Contato contato = new Contato(nome, celular, email, idade);
        listaContatos.add(contato);

        System.out.println("Contato adicionado com sucesso!");
    }

    private static void excluirContato(Scanner scanner, List<Contato> listaContatos) {
        System.out.print("Digite o nome do contato a ser excluído: ");
        String nomeExcluir = scanner.next();

        boolean contatoEncontrado = false;

        for (int i = 0; i < listaContatos.size(); i++) {
            Contato contato = listaContatos.get(i);
            if (contato.getNome().equalsIgnoreCase(nomeExcluir)) {
                listaContatos.remove(i);
                contatoEncontrado = true;
                System.out.println("Contato excluído com sucesso!");
                break;
            }
        }

        if (!contatoEncontrado) {
            System.out.println("Contato não encontrado.");
        }
    }

    private static void listarContatos(List<Contato> listaContatos) {
        System.out.println("Lista de Contatos:");

        for (Contato contato : listaContatos) {
            System.out.println("Nome: " + contato.getNome() + ", Celular: " + contato.getCelular() +
                    ", Email: " + contato.getEmail() + ", Idade: " + contato.getIdade());
        }
    }

    private static void calcularMediaIdade(List<Contato> listaContatos) {
        if (listaContatos.isEmpty()) {
            System.out.println("Não há contatos para calcular a média de idade.");
            return;
        }

        double totalIdade = 0;

        for (Contato contato : listaContatos) {
            totalIdade += contato.getIdade();
        }

        double mediaIdade = totalIdade / listaContatos.size();
        System.out.println("Média de idade de seus amigos: " + mediaIdade);
    }
}