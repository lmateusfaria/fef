
import java.util.Scanner;
public class App {
    // Uma pessoa só pode dirigir um veículo se for maior de
    // idade e possuir carteira de habilitação.
    // Faça um algoritmo que, dado a idade e a
    // situação da habilitação (0: não tem, 1:tem)
    // informe se a pessoa pode dirigir um veículo.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int idade, acompanhado;

        System.out.println("Digite a idade: ");
        idade = ler.nextInt();
        
        System.out.println("Esta acompanhado? 1 - Sim ou 2 - Nao: ");
        acompanhado = ler.nextInt();
        
        if(idade >= 18 || acompanhado == 1){
            System.out.println("Pode Entrar!");
        }else{
            System.out.println("Nao pode Entrar!");
        }

    }    
}
