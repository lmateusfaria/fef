import java.util.Scanner;
import java.util.Random;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();

        int [][] matriz = new int[10][10];
        int localizar,posicaoLinha=0,posicaoColuna=0;

        //for(int linha = 0; linha < 10;linha++ ){
        //    for(int coluna = 0;coluna < 10; coluna++){
        //        System.out.println("Entre com o "+(coluna+1)+" numero da linha "+(linha+1)+" :");
        //        matriz[linha][coluna] = ler.nextDouble();
        //    }
        //}

        for(int linha = 0; linha < 10;linha++ ){
            for(int coluna = 0;coluna < 10; coluna++){
                matriz[linha][coluna] = gerador.nextInt(10);
            }
        }
        
        for(int linha = 0; linha < 10;linha++ ){
            for(int coluna = 0;coluna < 10; coluna++){
                System.out.println(matriz[linha][coluna]);
            }
        }


        System.out.println("Entre com o numero a localizar:");
        localizar = ler.nextInt();

        for(int linha = 0; linha < 10;linha++ ){
            for(int coluna = 0;coluna < 10; coluna++){
                if(localizar == matriz[linha][coluna]){
                    posicaoLinha = linha;
                    posicaoColuna = coluna;
                }
            }
        }

        if(posicaoLinha != 0 && posicaoColuna != 0){
            System.out.println("A localização do número é ["+posicaoLinha+"]["+posicaoColuna+"]");
        }else{
            System.out.println("Não Encontrado!");
        }

    }
}
