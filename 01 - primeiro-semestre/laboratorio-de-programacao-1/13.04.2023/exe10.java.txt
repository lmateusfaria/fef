
import java.util.Scanner;
public class App {
    // Dado 04 notas, calcule a média destas notas. Se a média for
    // menor que 3, o aluno está reprovado. Se a média for menor que
    // 6, o aluno está de recuperação, senão o aluno está aprovado.
    
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double n1,n2,n3,n4,media;

        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        n4 = ler.nextDouble();
        
        media = (n1+n2+n3+n4)/4;

        if(media < 0 && media > 10){
            System.out.println("MEDIA INVALIDA");
        }else{
            if (media < 3){
                System.out.println("ALUNO REPROVADO NOTA MENOR QUE 3 => "+media);
            }else if (media < 6){
                System.out.println("ALUNO DE RECUPERAÇÃO NOTA MAIOR QUE 3 E MENOR QUE 6 => "+media);
            }else{
                System.out.println("ALUNO APROVADO => "+media);
            }
        }

    }    
}
