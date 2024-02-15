import java.util.Scanner;
public class App {
    // Segundo a OMS – Organização Mundial da Saúde a fórmula
    // para verificar se o indivíduo está é peso / (altura2)  
    // • Baseado nessa fórmula, tem-se as seguintes referências:
    // Fonte: http://www.calculoimc.com.br/tabela-de-imc
    // • Dado o peso e a altura do indivíduo, verifique em qual faixa
    // de peso ele se encontra de acordo com a tabela acima.

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double altura,peso,imc;

        System.out.println("Digite a altura:");
        altura = ler.nextDouble();
        System.out.println("Digite o peso:");
        peso = ler.nextDouble();

        imc = peso/(altura*altura);

        if(imc >= 40){
            System.out.println("IMC => "+imc+" - Obesidade III (Morbida)");
        }else{
            if(imc >= 35 && imc < 40){
                System.out.println("IMC => "+imc+" - Obesidade II (Severa)");
            }else if(imc >= 30 && imc < 35){
                System.out.println("IMC => "+imc+" - Obesidade I ");
            } else if (imc >= 25 && imc < 30){
                System.out.println("IMC => "+imc+" - Acima do peso ");
            }else if (imc >= 18.5 && imc < 25){
                System.out.println("IMC => "+imc+" - Peso normal");
            }else if (imc >= 17 && imc < 18.5){
                System.out.println("IMC => "+imc+" - Abaixo do peso");
            }else if (imc >= 0 && imc < 17){
                System.out.println("IMC => "+imc+" - Muito abaixo do peso");
            }else {
                System.out.println("IMC => "+imc+" - IMC INVALIDO");
            }
        }
    }    
}