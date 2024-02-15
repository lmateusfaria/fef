import java.util.Scanner;
//Exerceicio 1
//Faça um programa que leia 10 números inteiros,
//armazene-os em um array e depois percorra o array
//somando todos os valores. No final, mostre a soma.

public class App {
    public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner (System.in);
    int[] numeros = new int[10];
    int soma = 0;

    for (int i = 0; i < 10;i++){
        System.out.println("Digite o "+(i+1)+" numero:");
        numeros[i] = ler.nextInt();
    }
    
    for(int c =0 ; c < 10; c++){
        soma = soma +numeros[c];
    }
    
    System.out.println("A soma dos numeros digitados é = "+ soma);
    
    ler.close();
    
    }
}