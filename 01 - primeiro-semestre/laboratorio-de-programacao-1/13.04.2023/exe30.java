import java.util.Scanner;
public class App {
    // 8-Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de
    // um financiamento pretendido. Caso o financiamento seja menor ou igual a 5
    // vezes o salário da pessoa, o algoritmo deverá escrever “Financiamento
    // concedido”, caso contrário ele deverá escrever “Financiamento negado”.
    // Independente de conceder ou não o financiamento, o algoritmo escreverá
    // depois a frase “Obrigada por nos consultar ! “.

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double salario,finan,cond;
        
        System.out.println("Digite o valor do salario: ");
        salario = ler.nextDouble();
        System.out.println("Digite o valor do financiamento pretendido: ");
        finan = ler.nextDouble();
        	
        cond = salario*5;
	
        if ( finan <= cond)
            System.out.println("\nFINANCIAMENTO CONCEDIDO! \n\n");
        else
            System.out.println("\nFINANCIAMENTO NEGADO! \n\n");
        System.out.println("Obrigada por nos consultar!");
            
    }
}   