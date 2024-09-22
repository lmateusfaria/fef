import java.util.Scanner;
public class App {
    // 7-A CEF concederá um crédito especial com juros de 2% aos seus clientes de
    // acordo com o saldo médio no último ano. Fazer um algoritmo em PORTUGOL
    // que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com
    // a tabela a seguir. Imprimir uma mensagem informando o saldo médio e o valor de crédito.
    // Saldo Médio Percentual// De 0 a 500 Nenhum crédito
    // De 501 a 1000 30% do valor do saldo médio
    // De 1001 a 3000 40% do valor do saldo médio
    // Acima de 3001 50% do valor do saldo médio


    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Double saldo,valorCredito;
        
        System.out.println("Digite o saldo medio ");
        saldo = ler.nextDouble();
        
        	
        if (saldo >= 3001){
            valorCredito = saldo*0.5;
            System.out.println("\nCredito Aprovado \nValor Saldo = R$ "+saldo+"\nCredito liberado = R$ "+valorCredito);
        }
        else if (saldo >= 1001 && saldo <= 3000){
            valorCredito = saldo*0.4;
            System.out.println("\nCredito Aprovado \nValor Saldo = R$ "+saldo+"\nCredito liberado = R$ "+valorCredito);
        }
        else if (saldo >= 501 && saldo <= 1000){
            valorCredito = saldo*0.3;
            System.out.println("\nCredito Aprovado \nValor Saldo = R$ "+saldo+"\nCredito liberado = R$ "+valorCredito);
        }
        else
            System.out.println("\nCredito Reprovado \nValor Saldo = R$ "+saldo+"\nCredito nao liberado");

        
    }
}   