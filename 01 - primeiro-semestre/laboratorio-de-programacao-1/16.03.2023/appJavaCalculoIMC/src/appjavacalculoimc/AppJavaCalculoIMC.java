/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjavacalculoimc;
import java.util.Scanner;
/**
 *
 * @author fef
 */
public class AppJavaCalculoIMC {

    /**
     O índice de massa corpórea (IMC) de uma pessoa é igual
     ao seu peso (em quilogramas) dividido pelo quadrado de
     sua altura (em metros). Dados os peso e a altura de uma
     pessoa, informe o valor de seu IMC.
     */
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float imc, peso,alt;
        
        System.out.println("Digite o seu peso = ");
        peso = ler.nextFloat();
        System.out.println("Digite a sua altura = ");
        alt = ler.nextFloat();
        
        imc = peso / (alt*alt);
        
        System.out.println("Seu IMC é = " + imc);        
        
    }
    
}
