import java.util.Scanner;

import model.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        Conta dadosCliente = new Conta();
        int op = 0;

        System.out.println("Digite o banco da conta:");
        dadosCliente.setBanco(ler.next());
        
        System.out.println("Digite a agencia da conta:");
        dadosCliente.setNumeroAgencia(ler.next());
        
        System.out.println("Digite o número da conta:");
        dadosCliente.setNumeroConta(ler.next());
        
        System.out.println("Informe o saldo atual: ");
        dadosCliente.setSaldoAtual(ler.nextDouble());
        
        do{
            System.out.println("Menu Principal \n1. Deposita \n2. Saca \n3. Extrato \n9. Encerrar");
            op = ler.nextInt();

            double valor = 0.0;
            String resposta = "";
            
            if(op == 1){
                System.out.println("Informe o valor do deposito:");
                valor = ler.nextDouble();
                resposta=dadosCliente.deposita(valor);
                System.out.println(resposta);
            }else if (op ==2){
                System.out.println("Entre com o valor do saque:");
                System.out.println(dadosCliente.saca(ler.nextDouble()));
            }else if (op ==3){
                System.out.println("EXTRATO");
                System.out.println(dadosCliente.toString());
            }else if (op ==9){
                System.out.println("Encerrando o programa!");
            }else{
                System.out.println("Opção Inválida");
            }

        }while(op != 9);


    }
}
