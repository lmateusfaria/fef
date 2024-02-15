import java.util.List;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        int qtdNota,somaNota=0,media=0,posicao;
        
        System.out.println("Insira a quantidade das notas a serem inseridas:");
        qtdNota = ler.nextInt();

        double [] notas = new double[qtdNota];
         
        for(posicao = 0; posicao < qtdNota;posicao++ ){
            System.out.println("Insira a "+(posicao+1)+" nota:");
            notas[posicao] = ler.nextDouble();
            somaNota += notas[posicao];
        }
        
        media = somaNota/(posicao+1) ;
        for(posicao = 0; posicao < qtdNota;posicao++ ){
            System.out.println("Insira a "+(posicao+1)+" nota:");
            notas[posicao] = ler.nextDouble();
            somaNota += notas[posicao];
        }
    }   
}
