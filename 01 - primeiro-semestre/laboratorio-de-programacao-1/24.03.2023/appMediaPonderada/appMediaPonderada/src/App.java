import java.util.Scanner;
public class App {
    //8)- Faça um programa que leia três notas de um aluno, calcule e escreva a média final
    //deste aluno. Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5.
    //Fórmula para o cálculo da média final é:
    //n1 * 2 + n2 * 3 + n3 * 5
    //mediafinal = -----------------------------------
        //             10
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
                          
        float nota1,nota2,nota3,media;

        System.out.println("Insira a primeira nota :");
        nota1 = ler.nextFloat();
        
        System.out.println("Insira a segunda nota :");
        nota2 = ler.nextFloat();
        
        System.out.println("Insira a terceira nota :");
        nota3 = ler.nextFloat();
        
        media = (((nota1*2)+(nota2*3)+(nota3*5))/10);

        System.out.println("A Media Final do aluno = "+ media);
    }
}
