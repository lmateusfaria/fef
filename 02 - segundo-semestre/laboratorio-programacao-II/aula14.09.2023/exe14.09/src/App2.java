import java.util.Scanner;
import java.util.Random;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();
        int somaPosicaoPar=0,subPosicaoImpar=0;
        int [] vetor = new int[10];
        
        System.out.println("Preenchendo Matriz...\n\n");
        for(int linha = 0; linha < 10;linha++ ){
                vetor[linha] = gerador.nextInt(10);  
                System.out.println(vetor[linha]); 
        }
        
        for(int linha = 0; linha < 10;linha++ ){
            if (linha % 2 == 0){
                somaPosicaoPar += vetor[linha];
            }
            else{
                subPosicaoImpar -= vetor[linha];
            }
        }
        System.out.println("Soma das posições par = "+somaPosicaoPar);
        System.out.println("Subtração das posições impar = "+subPosicaoImpar);
        
    }   
}
