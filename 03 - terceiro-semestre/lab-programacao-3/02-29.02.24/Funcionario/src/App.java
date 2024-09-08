import java.util.Scanner;

import model.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Cadastre um Funcionario!");

        Funcionario funcionario1 = new Funcionario();

        System.out.println("Digite o nome:");
        funcionario1.setNome(ler.nextLine());

        System.out.println("Digite o cargo:");
        funcionario1.setCargo(ler.nextLine());

        System.out.println("Digite o valor da Hora:");
        funcionario1.setValorHoraTrabalhada(ler.nextDouble());

        System.out.println("Digite a Qtd de Horas Trabalhadas:");
        funcionario1.setQtdHoraTrabalhada(ler.nextDouble());

        System.out.println(funcionario1.toString());

        System.out.println("Digite o valor do desconto: ");
        Double desconto = ler.nextDouble();

        System.out.println("Salario Bruto = R$ " + funcionario1.calcularSalario());
        System.out.println("Salario Liquido = R$ " + funcionario1.calcularDesconto(desconto));

        ler.close();
    }
}
