package model;

public class Van extends Veiculo {
    public Van (String marca, String modelo, Integer anoFabricacao, Double aluguelDiario, Boolean alugado){
        super(marca, modelo, anoFabricacao, aluguelDiario, alugado);
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return "Van";
    }
}
