/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo02;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Exemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2,soma;
        
        System.out.println("Entre com o 1 numero inteiro");
        n1 = ler.nextInt();
        System.out.println("Entre com o 2 numero inteiro");
        n2 = ler.nextInt();
        soma = n1+n2;
        
        System.out.println("O resultado da soma de " + n1 +" e " + n2 + " é : "+ soma);
    }   
    
    
}
