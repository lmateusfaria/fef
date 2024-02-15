
import java.util.Scanner;
public class App {
    // Em uma fábrica de móveis, até 50 cadeiras, custa R$45,00
    // cada. Acima de 50 custa R$40,00. Dado o número de cadeiras,
    // informe o total a ser pago.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int cadeira;
        float total;

        System.out.println("Digite a quantidade de cadeiras vendidas: ");
        cadeira = ler.nextInt();

        if(cadeira <= 0){
            System.out.println("QUANTIDADE INVALIDA! => "+cadeira);
        }else{
            if(cadeira <= 50){
                total = cadeira*45;
                System.out.println("TOTAL A SER PAGO => R$ "+total+" em "+cadeira+" cadeiras");
            }else {
                total = cadeira*40;
                System.out.println("TOTAL A SER PAGO => R$ "+total+" em "+cadeira+" cadeiras");
            }
        }
    }
}
