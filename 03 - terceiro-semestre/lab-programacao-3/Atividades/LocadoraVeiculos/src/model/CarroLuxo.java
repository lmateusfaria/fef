package model;

public class CarroLuxo extends Veiculo {
    public CarroLuxo (String marca, String modelo, Integer anoFabricacao, Double aluguelDiario, Boolean alugado){
        super(marca, modelo, anoFabricacao, aluguelDiario, alugado);
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return "Carro de Luxo";
    }
}
