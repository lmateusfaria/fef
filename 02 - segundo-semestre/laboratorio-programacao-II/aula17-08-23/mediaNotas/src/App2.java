import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int n;
        double soma=0;
        
        System.out.println("Informe o numero de notas:");
        n = ler.nextInt();

        double[] notas = new double[n];

        for (int i =0;i <= n-1;i++){
            System.out.println("Digite a "+(i+1)+" nota:");
            notas[i] = ler.nextDouble();             
        }
        
        for(int contador = 0 ; contador < n; contador++){
            soma = soma + notas[contador];
        }

        double media = soma/n;

        ler.close();

        System.out.println("Media das notas = "+media);
        
    }
}
