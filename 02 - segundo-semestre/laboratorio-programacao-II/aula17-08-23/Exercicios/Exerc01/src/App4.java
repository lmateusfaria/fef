import java.util.Scanner;
//Exerceicio 4
public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int[] numeros = new int[5];
        int somaPar = 0, somaImpar = 0;
        
        //Inserir Numeros
        for (int i = 0; i < 5;i++){
            System.out.println("Digite o "+(i+1)+" numero:");
            numeros[i] = ler.nextInt();
        }
        //Soma Par
        for(int c =0 ; c < 5; c++){
            if (numeros[c] % 2 == 0){
                somaPar = somaPar +numeros[c];
            }
        }
        //Soma Impar
        for(int c =0 ; c < 5; c++){
            if (numeros[c] % 2 != 0){
                somaImpar = somaImpar +numeros[c];
            }
        }
        
        System.out.println("A soma dos numeros pares digitados é = "+ somaPar);
        System.out.println("A soma dos numeros impares digitados é = "+ somaImpar);
        
        ler.close();
    }
}
