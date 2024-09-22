import java.util.Scanner;
public class App {
    // A prefeitura de Contagem abriu uma linha de crédito para os funcionários
    // estatutários. O valor máximo da prestação não poderá ultrapassar 30% do
    // salário bruto. Fazer um algoritmo que permita entrar com o salário bruto e o
    // valor da prestação, e informar se o empréstimo pode ou não ser concedido.

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double salarioBruto,valorPrest,maxPrest;
        
        System.out.println("Digite o valor do salario bruto do funcionario = ");
        salarioBruto = ler.nextDouble();
        System.out.println("Digite o valor da prestacao = ");
        valorPrest = ler.nextDouble();
        
        maxPrest = salarioBruto*0.3;
        System.out.println("valor maximo por prestacao = "+maxPrest);
        
        if (valorPrest < maxPrest ){
            System.out.println("Emprestimo concedido");
        }else System.out.println("Emprestimo nao concedido");
    }
}   