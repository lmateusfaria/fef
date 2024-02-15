/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjavajuros;
import java.util.Scanner;
/**
Dados um capital C, uma taxa de juros mensal fixa J e
um período de aplicação em meses M, informe o
montante F no final do período.
F = C * (1+J/100)M
 */
public class AppJavaJuros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        float c,j,m,f;
        System.out.println("Digite o valor investido = ");
        c = ler.nextFloat();
        System.out.println("Digite a taxa de juros = ");
        j = ler.nextFloat();
        j = (1+j/100);
        System.out.println("Informe o periodo da aplicação em meses = ");
        m = ler.nextFloat();
        
        f = c*(j*m);
        
        System.out.println("Monte no final do periodo = " +f);
        
        
    }
    
}
