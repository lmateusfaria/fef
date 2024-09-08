package model;

public class carroLuxo extends Veiculo {
    
    public carroLuxo (String marca, String modelo, Integer anoFabricacao, Double aluguelDiario,Boolean alugado){
        super( marca, modelo, anoFabricacao, aluguelDiario,alugado);
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return "Carro de Luxo";
    }
}
