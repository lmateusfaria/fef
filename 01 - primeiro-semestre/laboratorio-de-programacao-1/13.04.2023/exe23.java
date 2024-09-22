import java.util.Scanner;
public class App {
// Escreva um algoritmo em PORTUGOL que leia um número e o imprima caso ele seja maior que 20.

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double n;

        System.out.println("Digite um numero:");
        n = ler.nextDouble();
        
        if(n == 20){
            System.out.println("Numero digitado => "+n+ " - igual a 20");
        }else{
            if(n > 20){
                System.out.println("Numero digitado => "+n+ " - maior que 20");
            }else{
                System.out.println("Numero digitado => "+n+ " - menor que 20");
            }
        }
    }    
}