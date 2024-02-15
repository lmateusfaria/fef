import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double[][] matrizA = new double[3][5];
        double[][] matrizB = new double[3][5];
        double[][] somaMatrizAB = new double[3][5];
        
        int contadorA =0;
        int contadorB =0;

        double somaMatrizes = 0;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Preenchendo Matriz A");
        for (int i=0; i<3;i++){
            for(int n=0; n < 5;n++){
                contadorA++;
                System.out.println("Entre com o "+contadorA+" numero:");
                matrizA[i][n] = ler.nextDouble();
            }
            System.out.println("\n");
        }

        System.out.println("Preenchendo Matriz B");
        for (int i=0; i<3;i++){
            for(int n=0; n < 5;n++){
                contadorB++;
                System.out.println("Entre com o "+contadorB+" numero:");
                matrizB[i][n] = ler.nextDouble();
            }
            System.out.println("\n");
        }


        System.out.println("Somando as Matrizes");
        for (int i=0; i<3;i++){
            for(int n=0; n < 5;n++){
                somaMatrizAB[i][n] = matrizA[i][n]+matrizB[i][n];
                somaMatrizes += matrizA[i][n]+matrizB[i][n];
            }
        }

        System.out.println("A Soma de Todos os Numeros das Matrizes = "+somaMatrizes+ "\n");

        for (int i=0; i<3;i++){
            for(int n=0; n < 5;n++){
                System.out.println(somaMatrizAB[i][n]);}
                System.out.println("\n");
        }
    }
}
