/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlebancario;

import java.util.Scanner;
import model.Conta;

/**
 *
 * @author jeffe
 */
public class ControleBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Conta objConta = new Conta();
        
        System.out.println("Entre com o banco:");
        objConta.setBanco(ler.next());
        
        System.out.println("Entre com a agencia");
        objConta.setNumeroAgencia(ler.next());
        
        System.out.println("Entre com a conta");
        objConta.setNumeroConta(ler.next());
        
        System.out.println("Informe o saldo atual");
        objConta.setSaldoAtual(ler.nextDouble());
        
        int op = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Deposita");
            System.out.println("2. Saca");
            System.out.println("3. Extrato");
            System.out.println("9. Encerrar");
            System.out.println("Escolha uma opcao:");
            op = ler.nextInt();
            double valor=0.00;
            String resposta="";
            if(op==1){
                System.out.println("Informe o valor do deposito");
                valor = ler.nextDouble();
                resposta=objConta.deposita(valor);
                System.out.println(resposta);
            } else if (op==2){
                System.out.println("Entre com valor do saque");
                System.out.println(objConta.saca(ler.nextDouble()));  
            } else if (op==3) {
                System.out.println("Extrato");
                System.out.println(objConta.toString());
            } else if (op==9) {
                System.out.println("Encerrando o programa");
            } else {
                System.out.println("Opção invalida");
            }
            
        }while(op!=9);   
    }
}
