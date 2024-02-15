package ex1;
import java.util.Scanner;
public class Ex1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um numero inteiro");
        n = ler.nextInt();
        
        if (n%2 == 0){
            System.out.println("Numero: "+ n +" e par!"); 
        } else {
            System.out.println("Numero: "+ n +" e impar!");    
        }
        
    }
    
}
