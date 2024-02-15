import java.util.Scanner;
//Exerceicio 3
public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int[] numeros = new int[5];
    
        for (int i = 0; i < 5;i++){
            System.out.println("Digite o "+(i+1)+" numero:");
            numeros[i] = ler.nextInt();
        }
        System.out.println("\n");
        for(int c = 4 ; c >= 0; c--){
            System.out.println(numeros[c]);    
        }
        
        ler.close();
    }
}
