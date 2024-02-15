package exe2;
import java.util.Scanner;
public class Exe2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2;
        
        System.out.println("Digite o primeiro numero:");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero:");
        n2 = ler.nextInt();
        
        if (n1 == n2){
        System.out.println("primeiro numero = "+n1+" igual o segundo numero = "+n2);
        }else{
            if (n2 > n1){
                System.out.println("segundo numero = "+n2+" maior que o primeiro numero = "+n1);    
            }else if (n1 > n2) {
                System.out.println("primeiro numero = "+n1+" maior que o segundo numero = "+n2);
            }
        }
    }
}