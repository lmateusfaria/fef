import java.util.Scanner;
public class App {
    // A prefeitura de Contagem abriu uma linha de cr�dito para os funcion�rios
    // estatut�rios. O valor m�ximo da presta��o n�o poder� ultrapassar 30% do
    // sal�rio bruto. Fazer um algoritmo que permita entrar com o sal�rio bruto e o
    // valor da presta��o, e informar se o empr�stimo pode ou n�o ser concedido.

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