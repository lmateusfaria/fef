
package exe5;
import java.util.Scanner;
public class Exe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int faltas,media;
        
        System.out.println("Digite o numero de faltas do aluno:");
        faltas = ler.nextInt();
        System.out.println("Digite a media do aluno:");
        media = ler.nextInt();
        
        if(faltas > 40){
            System.out.println("Aluno Reprovado");
        }else{
            if(media < 0 || media > 10 || faltas < 0){
                System.out.println("Media e/ou faltas invalidas");
            }else if(media >= 6 && media <= 10){
                System.out.println("Aluno Aprovado");   
            }else if (media < 6 && media >= 0){        
                System.out.println("Aluno de Recuperacao");
            }
        }
    }
    
}
