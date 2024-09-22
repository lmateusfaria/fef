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

______________________________________________________________________

import java.util.Scanner;
//Exerceicio 2
public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int[] numeros = new int[5];
        int soma = 0;
    
        for (int i = 0; i < 5;i++){
            System.out.println("Digite o "+(i+1)+" numero:");
            numeros[i] = ler.nextInt();
        }
        
        for(int c =0 ; c < 5; c++){
            if (numeros[c] % 2 == 0){
                soma = soma +numeros[c];
            }
            
        }
    
        System.out.println("A soma dos numeros pares digitados é = "+ soma);
    
        ler.close();
    }
}

_______________________________________________________________________

import java.util.Scanner;
//Exerceicio 3
public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int[] numeros = new int[5];
    
        for (int i = 0; i < 5;i++){
            System.out.println("Digite o "+(i+1)+" numero:");
            numeros[i] = ler.nextInt();
        }
        System.out.println("\n");
        for(int c = 4 ; c >= 0; c--){
            System.out.println(numeros[c]);    
        }
        
        ler.close();
    }
}

_________________________________________________________________________

import java.util.Scanner;
//Exerceicio 4
public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int[] numeros = new int[5];
        int somaPar = 0, somaImpar = 0;
        
        //Inserir Numeros
        for (int i = 0; i < 5;i++){
            System.out.println("Digite o "+(i+1)+" numero:");
            numeros[i] = ler.nextInt();
        }
        //Soma Par
        for(int c =0 ; c < 5; c++){
            if (numeros[c] % 2 == 0){
                somaPar = somaPar +numeros[c];
            }
        }
        //Soma Impar
        for(int c =0 ; c < 5; c++){
            if (numeros[c] % 2 != 0){
                somaImpar = somaImpar +numeros[c];
            }
        }
        
        System.out.println("A soma dos numeros pares digitados é = "+ somaPar);
        System.out.println("A soma dos numeros impares digitados é = "+ somaImpar);
        
        ler.close();
    }
}

____________________________________________________________________________