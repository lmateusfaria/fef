import java.util.Scanner;
public class App {
    // Dado um número inteiro, verifique se ele é zero, positivo ou negativo. Mostre
    // uma mensagem indicando a situação do número.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Digite um numero inteiro:");
        n = ler.nextInt();
        
        
        if(n == 0){
            System.out.println("numero igual a zero");
        }else{
            if(n > 0){
                System.out.println("numero positivo");
            }else{
                System.out.println("numero negativo");
            }
        }         
    }    
}