/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjavadobrodenumint;
import java.util.Scanner;
/**
Faça um programa que dado um número inteiro, exiba o
seu dobro.
 */
public class AppJavaDobroDeNumInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero = ");
        n = ler.nextInt();
        
        if (n > 0) {
            System.out.println("Digite um numero = "+ n);
        
        }
    }
    
}
