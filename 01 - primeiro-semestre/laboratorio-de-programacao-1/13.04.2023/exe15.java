import java.util.Scanner;
public class App {
    // Dado 2 n�meros inteiros, verifique se s�o iguais e exiba a mensagem �N�meros
    // iguais�, caso contr�rio verifique qual � o maior e exiba-o ao usu�rio.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n1,n2;

        System.out.println("Digite o primeiro numero inteiro:");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero inteiro:");
        n2 = ler.nextInt();
        
        if(n1 == n2){
            System.out.println("os numeros sao iguais");
        }else{
            if(n1 > n2){
                System.out.println("primeiro numero maior que o segundo numero!");
            }else{
                System.out.println("segundo numero maior que o primeiro numero!");
            }
            
        }         
    }    
}