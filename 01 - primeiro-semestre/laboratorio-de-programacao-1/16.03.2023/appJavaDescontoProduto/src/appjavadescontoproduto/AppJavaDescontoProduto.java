/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjavadescontoproduto;
import java.util.Scanner;

/**
 Faça um programa que dado o nome de um produto, seu
 valor e o valor do desconto (o desconto deverá ser
 aplicado como porcentagem) exiba o valor do desconto
 e o valor final do produto.
 */
public class AppJavaDescontoProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nomeProduto;
        float valorProduto, desconto,valorFinal;
        
        System.out.println("Informe o nome do Produto = ");
        nomeProduto = ler.nextLine();
        System.out.println("Informe o valor do Produto = ");
        valorProduto = ler.nextFloat();
        System.out.println("Informe o desconto em porcentagem (%) = ");
        desconto = ler.nextFloat();
        desconto = (desconto/100);
        
        System.out.println("Valor do desconto = R$ " + valorProduto*desconto);
        
        valorFinal = valorProduto-(valorProduto*desconto);
        System.out.println("Valor final do produto = "+ valorFinal);
        
        
    }
    
}
