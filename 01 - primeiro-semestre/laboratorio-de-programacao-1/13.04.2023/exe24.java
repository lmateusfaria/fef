import java.util.Scanner;
public class App {
// Escreva um algoritmo em PORTUGOL para determinar se um dado número N (recebido através do teclado) é POSITIVO, NEGATIVO.

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double n;

        System.out.println("Digite um numero:");
        n = ler.nextDouble();
        
        if (n == 0){
            System.out.println("numero igual a 0");
        }else if (n > 0){
            System.out.println("numero positivo");
        }else{
            System.out.println("numero negativo");
        }
    }
}     