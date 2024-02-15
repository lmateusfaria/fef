/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava01;

import java.util.Scanner;

/**
 *
 * @author fef
 */
public class AppJava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1,n2,media; int p1 = 2, p2 = 3;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite duas notas e receba a média ponderada considerando peso 2 para a primeira nota e peso 3 para a segunda nota");
        System.out.println("Digite a primeira nota = ");
        n1 = ler.nextFloat();
        System.out.println("Digite a segunda nota = ");
        n2 = ler.nextFloat();
        
        n1 = n1*p1;
        
        
        n2 = n2*p2;
        
        media = (n1 + n2) / (p1+p2);
        
        System.out.println("Media ponderada = " + media);
        
    }
    
}
