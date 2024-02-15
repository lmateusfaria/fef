/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo03;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Exemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int horasExtras;
        float salario,total;
        
        System.out.println("Entre com o salario :");
        salario = ler.nextFloat();
        System.out.println("Entre com o numero de horas extras:");
        horasExtras = ler.nextInt();
        
        total = (float) (salario + (horasExtras*12.5)) ;
        
        System.out.println("O salario a receber é :" + total);
        
    }
    
}
