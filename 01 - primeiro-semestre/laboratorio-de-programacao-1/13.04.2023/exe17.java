import java.util.Scanner;
public class App {
    // Para concorrer em um concurso p�blico � necess�rio ter mais de 18 anos e n�o
    // ter antecedentes criminais. Dado a idade e a situa��o dos antecedentes
    // criminais (0: n�o tem, 1: tem), informe se a pessoa pode participar do concurso.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int idade,antecedentes;

        System.out.println("Digite sua idade:");
        idade = ler.nextInt();
        System.out.println("Possui antecedentes criminais ? 0 - Nao Tem e 1 - Tem:");
        antecedentes = ler.nextInt();
        
        
        if(idade < 18 || antecedentes == 1 ){
            System.out.println("N�o pode participar!");
        }else{
            if(idade >= 18 && antecedentes == 0){
                System.out.println("Pode participar!");
            }else{
                System.out.println("Informacao Invalida!");
            }
        }         
    }    
}