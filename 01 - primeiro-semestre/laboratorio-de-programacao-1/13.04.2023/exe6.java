
import java.util.Scanner;
public class App {
    // Dado uma idade, verifique se a pessoa é maior ou menor de
    // idade. Mostre uma mensagem informativa.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.println("Digite, sua idade: ");
        idade = ler.nextInt();

        if(idade <= 0){
            System.out.println("IDADE INVALIDA! => "+idade);
        }else{
            if(idade < 18){
                System.out.println("Voce e MENOR de idade => "+idade+" Anos.");
            }else {
                System.out.println("Voce e MAIOR de idade => "+idade+" Anos.");
            }
        }
    }
}
