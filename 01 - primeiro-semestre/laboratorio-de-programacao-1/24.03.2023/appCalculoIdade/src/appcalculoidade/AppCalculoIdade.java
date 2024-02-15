/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculoidade;
import java.util.Scanner;
/**
3)-Construa um programa para ler o ano de nascimento de uma pessoa e o ano atual.
Calcular e imprimir sua idade em anos e quantos anos essa pessoa terá em 2031.
 */
public class AppCalculoIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoNascimento,anoAtual = 2023,idade, idade2031;
        
        System.out.println("Insira seu ano de nascimento:");
        anoNascimento = ler.nextInt();
        idade = anoAtual-anoNascimento;
        idade2031 = 2031-anoNascimento;
        System.out.println("Idade atual = " + idade);
        System.out.println("Idade em 2031 = " + idade2031);
        
        
        
        
        
    }
    
}
