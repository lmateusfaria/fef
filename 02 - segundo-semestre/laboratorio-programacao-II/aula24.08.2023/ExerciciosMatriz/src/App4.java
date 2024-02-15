import java.util.Scanner;
import java.util.Random;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();
        int tamanhoMatriz = 0,somaLinha4=0,somaColuna2=0;
        
        int [][] matriz = new int[5][5];
        
        System.out.println("Preenchendo Matriz...\n\n");
        for(int linha = 0; linha < 5;linha++ ){
            tamanhoMatriz++;
            for(int coluna = 0;coluna < 5; coluna++){
                matriz[linha][coluna] = gerador.nextInt(10);   
            }    
        }

        System.out.println("Tamanho da matriz => "+tamanhoMatriz);
        System.out.println("Mostrando Matriz Preenchida");
        
        for(int linha = 0; linha < 5;linha++ ){
            System.out.println("\n");
            for(int coluna = 0;coluna < 5; coluna++){
                System.out.println(matriz[linha][coluna]);
            }
        }

        System.out.println("Diagonal Principal da Matriz");
        for(int linha = 0; linha < 5;linha++ ){
            for(int coluna = 0;coluna < 5; coluna++){
                if (linha == coluna){
                    System.out.println(matriz[linha][coluna]);
                }
            }
        }

        System.out.println("Diagonal Secundaria da Matriz");
        for(int linha = 0; linha < 5;linha++ ){
            for(int coluna = 0;coluna < 5; coluna++){
                if (linha+coluna == tamanhoMatriz-1){
                    System.out.println(matriz[linha][coluna]);
                }
            }
        }

        System.out.println("Somando Linha 4 da Matriz");
        for(int linha = 0; linha < 5;linha++ ){
            for(int coluna = 0;coluna < 5; coluna++){
                if (linha == 4){
                    somaLinha4 += matriz[linha][coluna];
                }
            }
        }

        System.out.println("Soma da Linha 4 => "+ somaLinha4+"\n");
        
        
        System.out.println("Somando Coluna 2 da Matriz");
        for(int linha = 0; linha < 5;linha++ ){
            for(int coluna = 0;coluna < 5; coluna++){
                if (coluna == 2){
                    somaColuna2 += matriz[linha][coluna];
                }
            }
        }

        System.out.println("Soma da Coluna 2 => "+ somaColuna2+"\n");
    }
}
