import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int idade, tempo;
        double salario;

        System.out.println("Digite a idade em anos:");
        idade = ler.nextInt();
        System.out.println("Informe o tempo na empresa:");
        tempo = ler.nextInt();
        System.out.println("Qual o seu salario:");
        salario = ler.nextDouble();

        if((tempo > 3) && (idade > 30) && !(salario > 4000)){
            System.out.println("Recebera reajuste!");
        }else{
            System.out.println("Não recebera reajuste!");
        }         
    }    
}