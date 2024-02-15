
import java.util.Scanner;
public class App {
    // Dado o valor do produto e a forma de pagamento (V = à vista e
    // P = à prazo), se o produto for pago à vista aplique um desconto
    // de 10% antes de mostrar o valor final;
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double valor;
        String pagamento;

        System.out.println("Digite o valor do produto: ");
        valor = ler.nextDouble();
        
        System.out.println("\nV = a vista \nP = a prazo\nDigite a forma de pagamento: ");
        pagamento = ler.next();

        System.out.println(pagamento);

        if(pagamento.equals("V") || pagamento.equals("v")){
            valor = valor*0.9;
            System.out.println("Valor a vista => R$ "+valor);
        }else if (pagamento.equals("P") || pagamento.equals("p")){
            System.out.println("Valor a vista => R$ "+valor);
        }else{
            System.out.println("OPCAO DE PAGAMENTO INVALIDA => "+pagamento);
        }
 

    }    
}
