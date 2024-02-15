import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Abastecimento;

public class App {
    public static void main(String[] args) throws Exception {
        double somaKm = 0.0, somaLitros = 0.0; 
        Scanner ler = new Scanner (System.in);
        
        List<Abastecimento> abastecimentos = new ArrayList<Abastecimento>();
        int op = 0;
        
        do {
            
            Abastecimento dadosAbastecimento = new Abastecimento();
            
            System.out.println("Digite a opção desejada:\n1-Adicionar Novo Abastecimento\n2-Listar Abastecimentos\n3-Calcular a média de consumo da frota\n9-Sair");
            op = ler.nextInt();


            if(op==1){

                System.out.println("Adicionar novo Abastecimento:");
                
                System.out.println("Digite o modelo do veiculo:");
                dadosAbastecimento.setModeloVeiculo(ler.next());

                System.out.println("Digite a marca do veiculo:");
                dadosAbastecimento.setMarcaVeiculo(ler.next());

                System.out.println("Digite o kmRodado:");
                dadosAbastecimento.setKmRodado(ler.nextDouble());

                System.out.println("Digite o combustivel abastecido:");
                dadosAbastecimento.setCombustivelAbastecido(ler.nextDouble());
                
                dadosAbastecimento.calculaConsumo();

                abastecimentos.add(dadosAbastecimento);
            
            } else if (op==2){
                
                for (Abastecimento abastecimento : abastecimentos){
                    System.out.println(abastecimento.toString());
                }

            } else if (op==3) {
                System.out.println("Calcular Média de Consumo da Frota");

                for (Abastecimento abastecimento : abastecimentos){
                    somaKm += abastecimento.getKmRodado();
                    somaLitros += abastecimento.getCombustivelAbastecido();
                }
                
                System.out.println("A média do consumo da frota é = "+ (somaKm/somaLitros) + "\n\n");
            } else if (op==9) {
                System.out.println("Encerrando o programa");
            } else {
                System.out.println("Opção invalida");
            }
            
        } while (op != 9);
        
    
    }
}
