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
        Float  valorProduto, desconto, valorDesconto;

        System.out.println("DIGITE O NOME DO PRODUTO");
        nomeProduto = ler.nextLine();

        System.out.println("DIGITE O VALOR DO PRODUTO");
        valorProduto = ler.nextFloat();

        System.out.println("DESCONTO %");
        desconto = ler.nextFloat();

        System.out.println("O nome do produto é: " +  nomeProduto);

        System.out.println("O valor do produto é: R$" + valorProduto);
        
        System.out.println("O desconto é de: " + desconto+"%");

        desconto = desconto/100;

        valorDesconto = desconto*valorProduto;

        valorProduto = valorProduto-valorDesconto;

        System.out.println("VALOR DO DESCONTO: " + valorDesconto);

        System.out.println("VALOR FINAL: " + valorProduto);        





        
        
    }
    
}
