/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo01;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         int a; float b; String nome;
         
        System.out.println("Entre com um nome:");
        nome = ler.nextLine();
        System.out.println("Entre com um numero Inteiro:");
        a = ler.nextInt();
        System.out.println("Entre com um numero Decimal:");
        b = ler.nextFloat();
        
        System.out.println("nome: "+ nome);
        System.out.println("numero inteiro: "+ a);
        System.out.println("numero decimal: "+ b);
        
    }
    
}
