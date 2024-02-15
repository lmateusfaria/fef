/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedianota;
import java.util.Scanner;
/**
 2)-.Faça um programa que modele o gerenciamento de notas de uma determinada
 disciplina. Assim deverá ser informado o nome da disciplina, o RA do aluno e as quatro
 notas e o sistema deverá exibir como resposta o RA e a média. Considere a média
 aritmética para o cálculo.
 */
public class AppMediaNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String ra,nomeDisciplina;
        float nota1,nota2,nota3,nota4,media;
        
        System.out.println("Digite o RA do aluno:");
        ra = ler.nextLine();
        System.out.println("Digite o nome da disciplina:");
        nomeDisciplina = ler.nextLine();
        
        System.out.println("Digite a primeira nota:");
        nota1 = ler.nextFloat();
        System.out.println("Digite a segunda nota:");
        nota2 = ler.nextFloat();
        System.out.println("Digite a terceira nota:");
        nota3 = ler.nextFloat();
        System.out.println("Digite a quarta nota:");
        nota4 = ler.nextFloat();
        
        media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("RA do aluno = " + ra);
        System.out.println("A média aritmética das 4 notas é = " + media);
        
    }
    
}
