import java.util.Scanner;
//Exerceicio 2
public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int[] numeros = new int[5];
        int soma = 0;
    
        for (int i = 0; i < 5;i++){
            System.out.println("Digite o "+(i+1)+" numero:");
            numeros[i] = ler.nextInt();
        }
        
        for(int c =0 ; c < 5; c++){
            if (numeros[c] % 2 == 0){
                soma = soma +numeros[c];
            }
            
        }
    
        System.out.println("A soma dos numeros pares digitados é = "+ soma);
    
        ler.close();
    }
}
