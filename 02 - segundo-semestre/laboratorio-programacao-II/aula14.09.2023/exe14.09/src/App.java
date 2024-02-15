import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();
        int p,n=0;
        int [] vetor = new int[10];
        
        System.out.println("Preenchendo Matriz...\n\n");
        for(int linha = 0; linha < 10;linha++ ){
                vetor[linha] = gerador.nextInt(10);  
                System.out.println(vetor[linha]); 
        }
        
        System.out.println("Insira o numero a ser procurado:");
        p = ler.nextInt();
        
        for(int linha = 0; linha < 10;linha++ ){
            if (vetor[linha] == p){
                n++;
            }
        }
        System.out.println("O numero "+p+" foi encontrado "+n+" vezes no vetor");
        
    }   
}
