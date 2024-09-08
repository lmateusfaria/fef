import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        //Locadora locadora = new Locadora();
        Integer menuVeiculos = 0, tipoVeiculo = 0;

        Boolean menuValido = (menuVeiculos.equals(1) || menuVeiculos.equals(2) || menuVeiculos.equals(3) || menuVeiculos.equals(4) );
        Boolean tipoValido = (tipoVeiculo.equals(1) || tipoVeiculo.equals(2) || tipoVeiculo.equals(3) );
        
        System.out.println("Bem vindo a Locadora de Veiculos");
        do{
            System.out.println("1 - Adiciona um Novo Veiculo");
            System.out.println("2 - Aluga um Veiculo");
            System.out.println("3 - Devolve um Veiculo");
            System.out.println("4 - Exibi Veiculos Disponiveis");
            menuVeiculos = ler.nextInt();
            switch (menuVeiculos) {
                case 1:

                    do {
                        System.out.println("");
                        switch (tipoVeiculo) {
                            case 1:
                                //carroComum.adicionaCarrosComuns();
                                
                                return;
                            
                            case 2:
                                
                                return;
                            
                            case 3:
                                
                                return;
                            

                            default:
                                break;
                        }

                    } while (tipoValido);

                    System.out.println("Digite a Marca: ");
                    //veiculos.setMarca(ler.nextLine());
                    
                    System.out.println("Digite o Modelo: ");
                    //veiculos.setModelo(ler.nextLine());
                    
                    System.out.println("Digite o ano de Fabricacao:");
                    //veiculos.setAnoFabricacao(ler.nextInt());
                    
                    System.out.println("Digite o Aluguel Diario:");
                    //veiculos.setAluguelDiario(ler.nextDouble());
                    
                    //veiculos.setAlugado(false);
                    
                    //veiculos.adiciona(veiculos);
                    System.out.println("Veiculo adicionado!");
                    return;
                    
                case 2:
                    System.out.println("Veiculo foi alugado!");
                    return;
                case 3:
                    System.out.println("Veiculo foi devolvido!");
                    return;
                case 4:
                    System.out.println("Veiculos Disponíveis!");
                    return;
                
                default:
                    System.out.println("Opção Invalida!\nDigite uma opção Válida! ");
                    return;
            }
        }while(menuValido);
        
    }
}
