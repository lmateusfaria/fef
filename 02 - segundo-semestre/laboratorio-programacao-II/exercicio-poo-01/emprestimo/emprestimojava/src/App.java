import java.util.Scanner;

import model.Emprestimo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Emprestimo dadosEmprestimo = new Emprestimo();
        int op = 0;

        System.out.println("Entre com os dados do emprestimo\n\n ");
        
        System.out.println("Digite o nome do cliente: ");
        dadosEmprestimo.setCliente(ler.nextLine());
        
        System.out.println("Digite o banco do cliente: ");
        dadosEmprestimo.setBanco(ler.nextLine());
        
        System.out.println("Digite o valor do emprestimo: ");
        dadosEmprestimo.setValorEmprestimo(ler.nextDouble());
        
        System.out.println("Digite o numero de parcelas do emprestimo: ");
        dadosEmprestimo.setNumeroParcelas(ler.nextInt());
        
        dadosEmprestimo.calcularContrato();

        do{
            System.out.println("Menu Principal \n1. Pagar Parcela \n2. Extrato do Empréstimo \n9. Encerrar");
            op = ler.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Insira o valor do pagamento:");
                    double valorPagamento = ler.nextDouble();
                    System.out.println(dadosEmprestimo.pagarParcela(valorPagamento));
                    
                    break;
                
                case 2:
                    System.out.println("EXTRATO DO EMPRÉSTIMO\n");
                    System.out.println(dadosEmprestimo.toString());
                    break;

                case 9:
                    System.out.println("\nEncerrando o programa...\n");
                    break;
                
                default:
                System.out.println("\nOpção Inválida\n");
                    break;
            }


        }while (op != 9);

        ler.close();
    }
}
