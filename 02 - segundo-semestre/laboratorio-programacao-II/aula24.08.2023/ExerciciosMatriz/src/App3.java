import java.util.Scanner;
import java.util.Random;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();

        int k = 5 ; 
        int [][] matriz = new int[3][3];
        
        //for(int linha = 0; linha < 3;linha++ ){
        //    for(int coluna = 0;coluna < 3; coluna++){
        //        System.out.println("Insira o "+(coluna+1)+" numero da linha "+(linha+1)+" :");
        //        matriz[linha][coluna] = ler.nextInt();
        //    }
        //}

        for(int linha = 0; linha < 3;linha++ ){
            for(int coluna = 0;coluna < 3; coluna++){
                matriz[linha][coluna] = gerador.nextInt(10);
            }
        }
        
        System.out.println("\n\nNumeros Inteiros");
        for(int linha = 0; linha < 3;linha++ ){
            System.out.println("_");
            for(int coluna = 0;coluna < 3; coluna++){
                System.out.println(matriz[linha][coluna]);
            }
            //System.out.println("_");
        }

        
        for(int linha = 0; linha < 3;linha++ ){
            for(int coluna = 0;coluna < 3; coluna++){
                matriz[linha][coluna] *= k;
            }
        }
        System.out.println("\n\nNumeros Inteiros Multiplicado por 'K = 5'");
        for(int linha = 0; linha < 3;linha++ ){
            System.out.println("_");
            for(int coluna = 0;coluna < 3; coluna++){
                System.out.println(matriz[linha][coluna]);
            }
            //System.out.println("_");
        }

    }
}
