import java.util.Scanner;
public class App {
    // 6- A partir da idade informada de uma pessoa, elabore um algoritmo que
    // informe a sua classe eleitoral, sabendo que menores de 16 não votam (não
    // votante), que o voto é obrigatório para adultos entre 18 e 65 anos (eleitor
    // obrigatório) e que o voto é opcional para eleitores entre 16 e 18, ou maiores de
    // 65 anos (eleitor facultativo).


    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite sua idade ");
        idade = ler.nextInt();
        
        if (idade < 16)
            System.out.println("Menores de 16 anos nao votam");
        else if (idade > 18 && idade < 65)
            System.out.println("Voto Obrigatório - Idade =>"+idade);
        else if (idade >= 16 && idade <=18)
            System.out.println("Voto Opcional - Idade =>"+idade);
        else
            System.out.println("Voto Opcional - Idade =>"+idade);
    }
}   