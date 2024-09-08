package model;
import java.util.ArrayList;


public class Locadora {
    
    private ArrayList<Veiculo> frota = new  ArrayList<Veiculo>();

    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public void aluga(String veiculoDigitado) {
        for (Veiculo veiculo : frota){
            if(veiculo.getModelo().equals(veiculoDigitado) && veiculo.getAlugado().equals(false)){
                veiculo.setAlugado(true);
                System.out.println("Carro Alugado com Sucesso!");
                return;
            }else{
                //System.out.println("Erro ao Alugar!\nO Veiculo não está Disponível!");
            }
        }
        
        
    }

    public void devolve(String veiculoDigitado) {
        for (Veiculo veiculo : frota){
            if(veiculo.getModelo().equals(veiculoDigitado) && veiculo.getAlugado().equals(true)){
                veiculo.setAlugado(false);
                System.out.println("Carro Devolvido com Sucesso!");
                return;
            }else{
                //System.out.println("Erro ao Devolver!\nO Veiculo não está Disponível!");
            }
        }
        
    }

    public void exibirVeiculosDisponiveis(){
        for (Veiculo veiculo : frota){
            if(veiculo.getAlugado().equals(false)){
                System.out.println("--------------------------------------");
                veiculo.exibirVeiculo();
            }
        }
        
    }
}
