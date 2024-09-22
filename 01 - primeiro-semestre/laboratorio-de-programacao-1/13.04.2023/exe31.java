import java.util.Scanner;
public class App {
    // 9- Construa um algoritmo que leia três números,
    // calcule e escreva quantos destes números são maiores
    // que 10.

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float n1,n2,n3;
        
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextFloat();
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        n3 = ler.nextFloat();
        	
        if (n1 > 10 && n2 > 10 && n3 >10){
            System.out.println("todos os 3 numeros sao maiores que 10");
        }else{
            if((n1 > 10 && n2 > 10 && n3 <= 10) || (n1 > 10 && n2 <= 10 && n3 > 10) || (n1 <= 10 && n2 > 10 && n3 > 10 )){
                System.out.println("apenas 2 numeros sao maiores que 10");
            }else if((n1 > 10 && n2 <= 10 && n3 <= 10) || (n1 <= 10 && n2 > 10 && n3 <= 10 ) || (n1 <= 10 && n2 <= 10 && n3 > 10)){
                System.out.println("apenas 1 numero e maior que 10");
            }else {
                System.out.println("nenhum numero maior que 10");
            }
        }    
    }
}   