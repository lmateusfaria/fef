
import java.util.Scanner;
public class App {
    //7)- Uma revendedora de carros usados paga a seus funcionários vendedores um salário
    //fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do
    //valor das vendas por ele efetuadas. Escrever um programa que leia o número de carros
    //por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe
    //por carro vendido. Calcule e escreva o salário final do vendedor.
    
    public static void main(String[] args) throws Exception {
        float salarioFixo,comissaoFixa,valorVendas, salarioFinal;
        int carrosVendidos;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o salario fixo do funcionario:");
        salarioFixo = ler.nextFloat();
        
        System.out.println("Informe o valor da comissão fixa por carro vendido:");
        comissaoFixa = ler.nextFloat();

        System.out.println("Informe o numero de carros vendidos:");
        carrosVendidos = ler.nextInt();

        System.out.println("Informe o valor total das vendas:");
        valorVendas = ler.nextFloat();

        salarioFinal = comissaoFixa*carrosVendidos+salarioFixo+(valorVendas*5/100);
        
        System.out.println("O salario final do vendedor é = R$ "+salarioFinal);
        
    }
}
