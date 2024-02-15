import java.util.Scanner;
public class App {
    // Para exercer o serviço militar obrigatório, a pessoa deve ser do sexo masculino,
    // ser maior de 18 anos e não possuir antecedentes criminais. Dado o sexo, a
    // idade e a situação dos antecedentes criminais (0: não tem, 1: tem), informe se
    // a pessoa pode exercer o serviço militar obrigatório.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int idade, antecedentes;
        String sexo;

        System.out.println("Digite seu sexo M - Masculino e F - Feminino:");
        sexo = ler.next();
        System.out.println("Digite a idade:");
        idade = ler.nextInt();
        System.out.println("Possui antecedentes criminais ? 0 - Nao Tem e 1 - Tem:");
        antecedentes = ler.nextInt();

        if(sexo.equals("M") || sexo.equals("m")){
            if(idade >= 18 && antecedentes == 0){
                System.out.println("Pode exercer o serviço militar obrigatório");
            }
        }else{
            System.out.println("não pode exercer o serviço militar obrigatório!");
        }         
    }    
}