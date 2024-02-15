
import java.util.Scanner;
public class App {
    // Dado um valor, multiplique-o por 10 . Se o resultado for
    // diferente de 100, adicione 10 e mostre o resultado, senão,
    // simplesmente mostre o resultado.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float valor,resultado; 
        
        System.out.println("Digite um valor: ");
        valor = ler.nextFloat();
        
        resultado = valor*10;

        if(resultado != 100){
            resultado = resultado+10;
            System.out.println("RESULTADO => "+resultado);
        }else{
            System.out.println("RESULTADO => "+resultado);
        }
    }
}
