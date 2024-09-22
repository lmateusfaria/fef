import java.util.Scanner;
public class App {
// Construa um algoritmo em PORTUGOL que imprima qual o menor e qual o maior valor de dois números A e B, lidos através do teclado.

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double n1,n2;

        System.out.println("Digite o primeiro numero:");
        n1 = ler.nextDouble();
        System.out.println("Digite o primeiro numero:");
        n2 = ler.nextDouble();

        if (n1 == n2){
            System.out.println("numeros iguais");
        }else {
            if (n1 > n2){
                System.out.println("primeiro numero maior que o segundo");
            }else{
                System.out.println("segundo numero maior que o primeiro");
            }
        }
    }
}   