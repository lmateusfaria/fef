/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjavareajustesalario;
import java.util.Scanner;
/**
 *
Faça um programa que dado o nome, o salário e o
reajuste (o reajuste deverá ser aplicado em
porcentagem), exiba o nome do funcionário e o seu
novo salário.
 */
public class AppJavaReajusteSalario {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        float salario,reajuste;
                
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Informe o nome do funcionario = ");
        nome = ler.nextLine();
        
        System.out.println("Informe o salario atual do funcionario = ");
        salario = ler.nextFloat();
        
        System.out.println("Informe o reajuste em porcentagem(%) = ");
        reajuste = ler.nextFloat();
        reajuste = reajuste/100;
        
        salario = salario+(salario*reajuste);

        System.out.println("Nome do funcionario = " + nome);
        System.out.println("Novo salario do funcionario = " + salario);

    }
    
}
