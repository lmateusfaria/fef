
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        FilhoMedico pessoa = new FilhoMedico();
        System.out.println("Informe o seu nome:");
        pessoa.nome = ler.nextLine();
        System.out.println("Informe seu cargo: ");
        pessoa.cargo = ler.nextLine();
        System.out.println("Infome o valor da hora trabalhada: ");
        pessoa.valor_h_trab = ler.nextFloat();
        System.out.println("Infome o CRM: ");
        pessoa.crm = ler.next();
        System.out.println("Infome o valor do bonus: ");
        pessoa.bonus = ler.nextFloat();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        pessoa.qtdht = ler.nextInt();

        float salario = pessoa.calc_sal(pessoa.valor_h_trab, pessoa.qtdht);
        float salMedico = pessoa.calcularBonus(salario, pessoa.bonus);
        System.out.printf("O salario do funcionario " + pessoa.nome + " com o cargo " +
                pessoa.cargo + " será de %.2f", salMedico);
        int op;
        System.out.printf("\nDeseja calcular um desconto \n [1] - SIM [2] - NÃO\n");
        op = ler.nextInt();
        if (op == 1) {
            System.out.println("Infome o valor a ser descontado");
            float valor = ler.nextFloat();
            float desc = pessoa.desc_sal(salario, valor);
            System.out.println("O valor do salario com desconto é " + desc);
        } else {
            System.out.println("Sistema encerrado!");
        }
        ler.close();
    }

}
