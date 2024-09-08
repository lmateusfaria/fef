package model;

import model.Veiculo;
import java.util.ArrayList;

public class Locadora {
    
    private ArrayList<Veiculo> frota = new  ArrayList<Veiculo>();

    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
        return;
    }

    public void aluga(Veiculo veiculo) {
        if(veiculo.getAlugado().equals(false)){
            veiculo.setAlugado(true);
            System.out.println("Carro Alugado com Sucesso!");
            return;    
        }
        System.out.println("Erro ao Alugar!\nO Veiculo não está Disponível!");
    }

    public void devolve(Veiculo veiculo) {
        if(veiculo.getAlugado().equals(true)){
            veiculo.setAlugado(false);
            System.out.println("Carro Devolvido com Sucesso!");
            return;    
        }
        System.out.println("Erro ao Devolver!\nO Veiculo não está Alugado!");
    }
    public void exibirVeiculosDisponiveis(){
        
        for (Veiculo veiculo : frota){
            if(veiculo.getAlugado().equals(false)){

            }
        }
        return;
    }
}
