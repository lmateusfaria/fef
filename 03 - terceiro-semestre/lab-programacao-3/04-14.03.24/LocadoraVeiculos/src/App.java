
import model.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Locadora locadora = new Locadora();

        Integer menuVeiculos = 0, tipoVeiculo = 0;

        System.out.println("Bem vindo a Locadora de Veiculos");
        do {
            System.out.println("1 - Adiciona um Novo Veiculo");
            System.out.println("2 - Aluga um Veiculo");
            System.out.println("3 - Devolve um Veiculo");
            System.out.println("4 - Exibi Veiculos Disponiveis");
            System.out.println("Insira uma opção: ");

            menuVeiculos = ler.nextInt();

            if (menuVeiculos.equals(1)) {
                System.out.println("Para adicionar um carro, primeiro você deve selecionar o seu tipo:");
                System.out.println("1-Carro Comum\n2-Carro de Luxo\n3-Van\nInsira uma opção: ");
                tipoVeiculo = ler.nextInt();
                if (tipoVeiculo.equals(1)) {

                    carroComum carroComum = new carroComum(null, null, 0, null, false);

                    System.out.println("Digite a Marca: ");
                    carroComum.setMarca(ler.next());

                    System.out.println("Digite o Modelo: ");
                    carroComum.setModelo(ler.next());

                    System.out.println("Digite o Ano de Fabricação: ");
                    carroComum.setAnoFabricacao(ler.nextInt());

                    System.out.println("Digite o Aluguel Diario: ");
                    carroComum.setAluguelDiario(ler.nextDouble());

                    locadora.adicionarVeiculo(carroComum);

                    System.out.println("Veiculo Adicionado => CARRO COMUM ");

                } else if (tipoVeiculo.equals(2)) {
                    carroLuxo carroLuxo = new carroLuxo(null, null, 0, null, false);

                    System.out.println("Digite a Marca: ");
                    carroLuxo.setMarca(ler.next());

                    System.out.println("Digite o Modelo: ");
                    carroLuxo.setModelo(ler.next());

                    System.out.println("Digite o Ano de Fabricação: ");
                    carroLuxo.setAnoFabricacao(ler.nextInt());

                    System.out.println("Digite o Aluguel Diario: ");
                    carroLuxo.setAluguelDiario(ler.nextDouble());

                    locadora.adicionarVeiculo(carroLuxo);

                    System.out.println("Veiculo Adicionado => CARRO DE LUXO");

                } else if (tipoVeiculo.equals(3)) {
                    Van van = new Van(null, null, 0, null, false);

                    System.out.println("Digite a Marca: ");
                    van.setMarca(ler.next());

                    System.out.println("Digite o Modelo: ");
                    van.setModelo(ler.next());

                    System.out.println("Digite o Ano de Fabricação: ");
                    van.setAnoFabricacao(ler.nextInt());

                    System.out.println("Digite o Aluguel Diario: ");
                    van.setAluguelDiario(ler.nextDouble());

                    locadora.adicionarVeiculo(van);

                    System.out.println("Veiculo Adicionado => VAN ! ");

                    
                } else {
                    System.out.println("OPÇÃO INVALIDA");
                    
                }

            } else if (menuVeiculos.equals(2)) {
                System.out.println("Insira o modelo do carro: ");
                locadora.aluga(ler.next());
            } else if (menuVeiculos.equals(3)) {
                System.out.println("Insira o modelo do carro: ");
                locadora.devolve(ler.next());
            } else if (menuVeiculos.equals(4)) {
                 
                System.out.println("Frota Disponivel da Locadora: ");
                locadora.exibirVeiculosDisponiveis();

                
            } else {
                System.out.println("OPÇÃO INVALIDA");
                
            }

        } while ((menuVeiculos == (1) || menuVeiculos.equals(2) || menuVeiculos.equals(3) || menuVeiculos.equals(4)));

        ler.close();
    }
}
