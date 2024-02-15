/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjavacustoforro;
import java.util.Scanner;

/**
 *
 * @author fef
 */
public class AppJavaCustoForro {

    public static void main(String[] args) {
        // Dadas as medidas de uma sala em metros(comprimento
        // e largura), bem como o preço do metro quadrado de
        // carpete, informe o custo total para forrar o piso da sala.
        Scanner ler = new Scanner(System.in);
        float comp,larg, valor;
        
        
    
        System.out.println("Digite o comprimento = ");
        comp = ler.nextFloat();
        System.out.println("Digite a largura = ");
        larg = ler.nextFloat();

        System.out.println("Metros quadrados da sala = " + comp*larg);

        System.out.println("Valor do carpete por metro quadrado= ");
        valor = ler.nextFloat();
        
        valor = (larg*comp)*valor;
        
        System.out.println("Valor total para forrar a sala = " + valor);
        
        
    }
    
}
