package exe3;
import java.util.Scanner;
public class Exe3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um numero inteiro:");
        n = ler.nextInt();
        
        if(n > 0){
            System.out.println("Número maior que zero");
        }else {
            n +=10;
            System.out.println(n);
        }
        
    }
    
}
