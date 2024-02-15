package model;

public class Abastecimento {
    private String modeloVeiculo;
    private String marcaVeiculo;
    private Double kmRodado;
    private Double combustivelAbastecido;
    private Double consumoKmLitro;

    public Abastecimento() {
        this.modeloVeiculo = "";
        this.marcaVeiculo = "";
        this.kmRodado = 0.0;
        this.combustivelAbastecido = 0.0;
        this.consumoKmLitro = 0.0;
    }
    
    public Abastecimento(String modeloVeiculo, String marcaVeiculo, Double kmRodado, Double combustivelAbastecido, Double consumoKmLitro) {
        this.modeloVeiculo = modeloVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.kmRodado = kmRodado;
        this.combustivelAbastecido = combustivelAbastecido;
        this.consumoKmLitro = consumoKmLitro;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public Double getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(Double kmRodado) {
        this.kmRodado = kmRodado;
    }

    public Double getCombustivelAbastecido() {
        return combustivelAbastecido;
    }

    public void setCombustivelAbastecido(Double combustivelAbastecido) {
        this.combustivelAbastecido = combustivelAbastecido;
    }

    public Double getConsumoKmLitro() {
        return consumoKmLitro;
    }

    public void setConsumoKmLitro(Double consumoKmLitro) {
        this.consumoKmLitro = consumoKmLitro;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((modeloVeiculo == null) ? 0 : modeloVeiculo.hashCode());
        result = prime * result + ((marcaVeiculo == null) ? 0 : marcaVeiculo.hashCode());
        result = prime * result + ((kmRodado == null) ? 0 : kmRodado.hashCode());
        result = prime * result + ((combustivelAbastecido == null) ? 0 : combustivelAbastecido.hashCode());
        result = prime * result + ((consumoKmLitro == null) ? 0 : consumoKmLitro.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Abastecimento other = (Abastecimento) obj;
        if (modeloVeiculo == null) {
            if (other.modeloVeiculo != null)
                return false;
        } else if (!modeloVeiculo.equals(other.modeloVeiculo))
            return false;
        if (marcaVeiculo == null) {
            if (other.marcaVeiculo != null)
                return false;
        } else if (!marcaVeiculo.equals(other.marcaVeiculo))
            return false;
        if (kmRodado == null) {
            if (other.kmRodado != null)
                return false;
        } else if (!kmRodado.equals(other.kmRodado))
            return false;
        if (combustivelAbastecido == null) {
            if (other.combustivelAbastecido != null)
                return false;
        } else if (!combustivelAbastecido.equals(other.combustivelAbastecido))
            return false;
        if (consumoKmLitro == null) {
            if (other.consumoKmLitro != null)
                return false;
        } else if (!consumoKmLitro.equals(other.consumoKmLitro))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\n--------------\nAbastecimento Modelo do Veiculo: " + modeloVeiculo +
        "\nMarca do Veiculo: " + marcaVeiculo +
        "\nkmRodado: " + kmRodado +
        "\nCombustivel Abastecido: " + combustivelAbastecido +
        "\nKmLitro: " + consumoKmLitro + "\n--------------";
    }
    
    public void calculaConsumo() {
        this.consumoKmLitro = this.kmRodado/this.combustivelAbastecido;
    }

    
}
