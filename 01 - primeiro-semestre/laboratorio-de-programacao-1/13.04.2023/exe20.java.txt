import java.util.Scanner;
public class App {
    // Para concorrer uma vaga em um concurso público, a pessoa deve possuir
    // mestrado ou doutorado e ter mais de 5 anos e experiência. Dado a titulação
    // (D: doutorado, M: mestrado e G: graduado) e o tempo de experiência em anos,
    // informe se ele pode participar do concurso.
    
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int exp;
        String titulacao;

        System.out.println("Insira a titulacao (D: doutorado, M: mestrado e G: graduado):");
        titulacao = ler.next();
        System.out.println("Digite os anos de experiencia:");
        exp = ler.nextInt();

        if(exp > 5){
            switch (titulacao.toUpperCase()) {
                case "G":
                    System.out.println("Não pode participar do concurso");
                    break;
                case "M":
                    System.out.println("Pode participar do concurso");
                    break;
                case "D":
                    System.out.println("Pode participar do concurso");
                    break;
                default:
                    System.out.println("TITULACAO INVALIDA");
                    break;
            }
        }else{
            System.out.println("Não pode participar do concurso");
        }         
    }    
}