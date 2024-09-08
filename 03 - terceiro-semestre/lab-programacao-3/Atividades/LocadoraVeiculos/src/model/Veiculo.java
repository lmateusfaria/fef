package model;

abstract class Veiculo {
    private String marca ;
    private String modelo ;
    private Integer anoFabricacao ;
    private Double aluguelDiario ;
    private Boolean alugado ;

    public Veiculo() {
        this.marca = "";
        this.modelo = "";
        this.anoFabricacao = 0;
        this.aluguelDiario = 0.0;
        this.alugado = false;
    }
    
    public Veiculo(String marca, String modelo, Integer anoFabricacao, Double aluguelDiario, Boolean alugado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.aluguelDiario = aluguelDiario;
        this.alugado = alugado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Double getAluguelDiario() {
        return aluguelDiario;
    }

    public void setAluguelDiario(Double aluguelDiario) {
        this.aluguelDiario = aluguelDiario;
    }

    public Boolean getAlugado() {
        return alugado;
    }

    public void setAlugado(Boolean alugado) {
        this.alugado = alugado;
    }

    

    public abstract String getTipo();


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((anoFabricacao == null) ? 0 : anoFabricacao.hashCode());
        result = prime * result + ((aluguelDiario == null) ? 0 : aluguelDiario.hashCode());
        result = prime * result + ((alugado == null) ? 0 : alugado.hashCode());
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
        Veiculo other = (Veiculo) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (anoFabricacao == null) {
            if (other.anoFabricacao != null)
                return false;
        } else if (!anoFabricacao.equals(other.anoFabricacao))
            return false;
        if (aluguelDiario == null) {
            if (other.aluguelDiario != null)
                return false;
        } else if (!aluguelDiario.equals(other.aluguelDiario))
            return false;
        if (alugado == null) {
            if (other.alugado != null)
                return false;
        } else if (!alugado.equals(other.alugado))
            return false;
        return true;
    }

    public void exibirVeiculo() {
            System.out.println("Veiculo\nMarca: " + this.marca +
                               "\nModelo: " + this.modelo +
                               "Ano de Fabricacao: " + this.anoFabricacao +
                               "Aluguel Diario: " + this.aluguelDiario +
                               "Alugado: " + (this.alugado ? "INDISPONÍVEL":"DISPONÍVEL") +
                               "Tipo: "+this.getTipo());
            return ;    
    }

}
