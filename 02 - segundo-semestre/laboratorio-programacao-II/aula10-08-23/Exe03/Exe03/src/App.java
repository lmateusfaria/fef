import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int app=0;
        int numeroCharrete1,distanciaCharrete1,velocidadeCharrete1;
        int numeroCharrete2,distanciaCharrete2,velocidadeCharrete2;
        float tempo1=0,tempo2=0;

        while(app==0){
            
            System.out.println("Digite o numero da primeira charrete:");
            numeroCharrete1 = ler.nextInt();
            if(numeroCharrete1 < 1 || numeroCharrete1 > 99){
                System.out.println("Numero da Charrete inválido!");
                break;
            }
            
            System.out.println("Digite a distancia da Primeira Charrete:");
            distanciaCharrete1 = ler.nextInt();
            if(distanciaCharrete1 <= 0 || distanciaCharrete1 > 1000){
                System.out.println("Distancia da Charrete inválida!");
                break;
            }

            System.out.println("Digite a velocidade da Primeira Charrete:");
            velocidadeCharrete1 = ler.nextInt();
            if(velocidadeCharrete1 <= 0 || velocidadeCharrete1 > 50){
                System.out.println("Velocidade da Charrete inválida!");
                break;
            }

            
            System.out.println("Digite o numero da segunda charrete:");
            numeroCharrete2 = ler.nextInt();
            if(numeroCharrete2 < 1 || numeroCharrete2 > 99){
                System.out.println("Numero da Charrete inválido!");
                break;
            }

            if (numeroCharrete1 == numeroCharrete2){
                System.out.println("Numero das Charretes são iguais!");
                break;
            }
            
            System.out.println("Digite a distancia da segunda Charrete:");
            distanciaCharrete2 = ler.nextInt();
            if(distanciaCharrete2 <= 0 || distanciaCharrete2 > 1000){
                System.out.println("Distancia da Charrete inválida!");
                break;
            }

            System.out.println("Digite a velocidade da segunda Charrete:");
            velocidadeCharrete2 = ler.nextInt();
            if(velocidadeCharrete2 <= 0 || velocidadeCharrete2 > 50){
                System.out.println("Velocidade da Charrete inválida!");
                break;
            }

            tempo1 = distanciaCharrete1/velocidadeCharrete1;
            
            tempo2 = distanciaCharrete2/velocidadeCharrete2;
            
            if(tempo1 > tempo2){
                System.out.println(numeroCharrete1);
            }else{
                System.out.println(numeroCharrete2);
            }

            ler.close();
            break;
        }
            
    }
}
