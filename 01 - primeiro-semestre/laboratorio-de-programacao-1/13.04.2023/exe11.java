
import java.util.Scanner;
public class App {
    // Uma pessoa s� pode dirigir um ve�culo se for maior de
    // idade e possuir carteira de habilita��o.
    // Fa�a um algoritmo que, dado a idade e a
    // situa��o da habilita��o (0: n�o tem, 1:tem)
    // informe se a pessoa pode dirigir um ve�culo.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int idade, habilitacao;

        System.out.println("Digite a idade: ");
        idade = ler.nextInt();
        
        System.out.println("Possui Habilitacao: 1 - Sim ou 2 - Nao: ");
        habilitacao = ler.nextInt();
        
        if(idade >= 18 && habilitacao == 1){
            System.out.println("Pode Dirigir!");
        }else{
            System.out.println("Nao pode dirigir!");
        }

    }    
}
