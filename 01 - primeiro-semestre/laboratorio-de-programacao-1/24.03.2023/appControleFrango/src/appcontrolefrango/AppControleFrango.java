/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrolefrango;

import java.util.Scanner;

/**
 4)- A granja Fer&Cia. possui um controle automatizado de cada frango da sua
 produção. No pé direito do frango há um anel com um chip de identificação; no pé
 esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo
 que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50. Faça um programa
 para calcular o gasto total da granja para marcar todos os seus frangos. É necessário o
 empresário digitar a quantidade de frangos de sua produção.
 */
public class AppControleFrango {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtdFrango;
        double gastoTotal,gastoAneis;
        
        System.out.println("Digite a quantidade de frangos na Granja:");
        qtdFrango = ler.nextInt();
        gastoAneis = 3.50+3.50+4;
        gastoTotal = gastoAneis*qtdFrango;
        System.out.println("O gasto total para marca todos os frangos da Granja = R$ " + gastoTotal);
        
        
    }
    
}
