import java.util.Scanner;
public class App {
    // Faça um programa para classificar um triangulo de acordo com os seus lados
    // Escaleno = lados diferentes
    // Isóceles = dois lados iguais 
    // Equilatero = todos os lados iguais

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double ladoA,ladoB,ladoC;

        System.out.println("Digite o tamanho do lado A:");
        ladoA = ler.nextDouble();
        System.out.println("Digite o tamanho do lado B:");
        ladoB = ler.nextDouble();
        System.out.println("Digite o tamanho do lado C:");
        ladoC = ler.nextDouble();
        
        if(ladoA == ladoB && ladoB == ladoC){
            System.out.println("Triangulo Equilatero, possui todos os lados iguais");
        }else{
            if((ladoA == ladoB && ladoB != ladoC) || (ladoA == ladoC && ladoC != ladoB) || (ladoB == ladoC && ladoC != ladoA)){
                System.out.println("Triangulo Isoceles, possui dois lados iguais");
            }else{
                System.out.println("Triangulo Escaleno, todos os lados diferentes");
            }
        }
    }    
}