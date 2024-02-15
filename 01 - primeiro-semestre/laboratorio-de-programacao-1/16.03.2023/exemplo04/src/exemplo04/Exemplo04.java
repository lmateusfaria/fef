/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo04;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Exemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n1,n2,soma,subtracao,multiplicacao;
        float divisao,resto,raiz,potencia;
        
        System.out.println("Entre com o 1 numero: ");
        n1 = ler.nextInt();
        System.out.println("Entre com o 2 numero: ");
        n2 = ler.nextInt();
        
        soma = n1+n2;
        subtracao = n1-n2;
        multiplicacao = n1*n2;
        divisao = n1/n2;
        resto = n1%n2;
        potencia = (float) Math.pow(n1, n2);
        raiz = (float) Math.sqrt(n1);
        
        System.out.println("Soma de n1 e n2 é = " + soma);
        System.out.println("Subtração de n1 e n2 é = " + subtracao);
        System.out.println("Multiplicação de n1 e n2 é = " + multiplicacao);
        System.out.println("Divisão de n1 e n2 é = " + divisao);
        System.out.println("Resto de divisão de n1 e n2 é = " + resto);
        System.out.println("Potencia de n1 elevado a n2 é = " + potencia);
        System.out.println("Raiz Quadrada de n1 é = " + raiz);
        
        
    
    
    }   
    
}
