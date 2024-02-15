
package exe4;

import java.util.Scanner;

public class Exe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2,soma;
        
        System.out.println("Digite o primeiro numero inteiro: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        n2 = ler.nextInt();
        
        soma = n1+n2;
        
        if(soma > 10){
            System.out.println("Soma maior que 10!");
        }else{
            System.out.println("Computacao");
        }
    }
    
}
