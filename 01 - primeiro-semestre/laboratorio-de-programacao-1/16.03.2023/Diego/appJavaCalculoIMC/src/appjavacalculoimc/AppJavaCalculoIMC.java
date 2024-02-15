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

Float Peso, Altura, IMC;

System.out.println("Digite sua altura");
Altura = ler.nextFloat();
Altura = Altura * Altura;

System.out.println("Digite seu Peso");
Peso = ler.nextFloat();

IMC = Peso/Altura;

System.out.println("Seu IMC é: "+ IMC);





}
    
}
