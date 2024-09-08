import model.Funcionario;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int op = 0;
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do funcionario:");
        funcionario.setNome(ler.nextLine());
        
        System.out.println("Digite a data de Nascimento:");
        funcionario.setDataNascimento(ler.nextLine());
        
        do{
            System.out.println("Digite 1 para Ponto de Entrada e 2 para Ponto de Saida!");
            op = ler.nextInt();

            if (op == 1) {
                System.out.println(funcionario.PontoEntrada());
            }else if (op == 2 ){
                System.out.println(funcionario.PontoSaida());
                
            }
        }while(op == 1 || op == 2);
    }
}
