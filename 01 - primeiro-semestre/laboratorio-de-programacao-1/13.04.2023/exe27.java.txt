import java.util.Scanner;
public class App {
    //5-Construa um algoritmo de PORTUGOL para determinar se o indivíduo esta
    // com um peso favorável. Essa situação é determinada através do IMC (Índice
    // de Massa Corpórea), que é definida como sendo a relação entre o peso
    // (PESO) e o quadrado da Altura (ALTURA) do indivíduo. Ou seja,
    // IMC ??PESO/ ALTURA²
    // e, a situação do peso é determinada pela tabela abaixo:
    // Condição Situação
    // IMC abaixo de 20 Abaixo do peso
    // IMC de 20 até 25 Peso Normal
    // IMC de 25 até 30 Sobre Peso
    // IMC de 30 até 40 Obeso
    // IMC de 40 e acima Obeso Mórbido

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double peso,altura,imc;
        
        System.out.println("Digite sua altura ");
        altura = ler.nextDouble();
        System.out.println("Digite o seu peso ");
        peso = ler.nextDouble();
        
        imc = peso/(altura*altura);
        
        if (imc <= 20)
            System.out.println("Abaixo do peso - seu IMC => "+imc);
        else if (imc > 20 && imc <= 25 )
            System.out.println("Peso Normal - seu IMC => "+imc);
        else if (imc > 25 && imc <= 30 )
            System.out.println("Sobre Peso - seu IMC => "+imc);
        else if (imc > 30 && imc <= 40 )
            System.out.println("Obeso - seu IMC => "+imc);
        else if (imc > 40 )
            System.out.println("Obeso Morbido - seu IMC => "+imc);
        
    }
}   