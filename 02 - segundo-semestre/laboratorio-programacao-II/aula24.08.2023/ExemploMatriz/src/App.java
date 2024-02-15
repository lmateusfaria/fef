import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double[][] notasAlunos = new double[5][5];
        double[] mediaNotas = new double[5];
        double somaNotas = 0;

        Scanner ler = new Scanner(System.in);

        for (int i=0; i<5;i++){
            for(int n=0; n < 5;n++){
                System.out.println("Entre com a nota "+(n+1)+" do aluno "+(i+1)+":");
                notasAlunos[i][n] = ler.nextDouble();
            }
            System.out.println("\n");
        }

        int contar = 0;
         
        for (int i=0; i<5;i++){
            for(int n=0; n < 5;n++){
                somaNotas += notasAlunos[i][n];
                contar++;
            }
                
            mediaNotas[i] = somaNotas/contar;
            contar = 0;
            somaNotas = 0;
        }

        for(int a =0; a<5;a++){
            System.out.println("A média do aluno "+(a+1)+" é: "+ mediaNotas[a]);
        }
        
    }
}
