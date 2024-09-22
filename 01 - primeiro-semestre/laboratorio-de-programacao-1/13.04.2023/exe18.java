import java.util.Scanner;
public class App {
    // Faça um algoritmo que receba um número inteiro como entrada e verifique se
    // este número está entre 100 e 200 (incluindo 100 e 200). Mostre uma
    // mensagem informando a situação do número.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Digite um numero inteiro:");
        n = ler.nextInt();
        
        if(n >= 100 && n <= 200){
            System.out.println("Numero entre 100 e 200!");
        }else{
            System.out.println("Numero não esta entre 100 e 200!");
        }         
    }    
}