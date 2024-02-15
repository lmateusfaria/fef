import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        double nota1,nota2,nota3,nota4,nota5,media;
        
        System.out.println("Digite a primeira nota:");
        nota1 = ler.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        nota2 = ler.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        nota3 = ler.nextDouble();
        
        System.out.println("Digite a quarta nota:");
        nota4 = ler.nextDouble();
        
        System.out.println("Digite a quinta nota:");
        nota5 = ler.nextDouble();
        
        media = (nota1+nota2+nota3+nota4+nota5)/5;

        ler.close();

        System.out.println("Media das notas = "+media);
        
    }
}
