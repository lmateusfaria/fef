import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Pessoa funcionario1 = new Pessoa();
        
        System.out.println("Informe o nome do funcionario: ");
        funcionario1.nome = ler.nextLine();
        System.out.println("Informe o cpf do funcionario: ");
        funcionario1.cpf = ler.nextLine();
        System.out.println("Informe o sexo do funcionario: ");
        funcionario1.sexo = ler.nextLine();
        System.out.println("Informe a idade do funcionario: ");
        funcionario1.sexo = ler.nextLine();
        
        System.out.println(funcionario1.Ponto());

        System.out.println(funcionario1.Sair());
        
        System.out.println("Encerrando...");
        ler.close();
    }
}
