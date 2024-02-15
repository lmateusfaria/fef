/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprestaurantekilo;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 1)- Faça um programa para um restaurante por quilo. Esse restaurante cobra R$12,00
por cada quilo de refeição e o peso do prato montado pelo cliente é em quilos e na
balança já está descontado peso do prato. Faça um programa que leia o peso do prato do
cliente e determine a valor a ser pago.
 */
public class AppRestauranteKilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float pesoPrato, precoFinal;
        
        System.out.println("Digite o peso do prato:");
        pesoPrato = ler.nextFloat();
        
        precoFinal = pesoPrato*12;
        
        System.out.println(("Valor do prato = R$ "+precoFinal));
        
        
        System.out.println(new DecimalFormat("Valor do prato formatado = R$ #,##0.00").format(precoFinal));
        
        
    }
    
}
