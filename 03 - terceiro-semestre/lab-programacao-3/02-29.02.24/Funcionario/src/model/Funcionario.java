package model;

/**
 * Funcionario
 */
public class Funcionario {

    private String nome;
    private String cargo;
    private Double valorHoraTrabalhada;
    private Double qtdHoraTrabalhada;
    private Double desconto;

    public Funcionario() {
        this.nome = "";
        this.cargo = "";
        this.valorHoraTrabalhada = 0.0;
        this.qtdHoraTrabalhada = 0.0;
        this.desconto = 0.0;
    }

    public Funcionario(String nome, String cargo, Double valorHoraTrabalhada, Double qtdHoraTrabalhada,
            Double desconto) {
        this.nome = nome;
        this.cargo = cargo;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.qtdHoraTrabalhada = qtdHoraTrabalhada;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public Double getQtdHoraTrabalhada() {
        return qtdHoraTrabalhada;
    }

    public void setQtdHoraTrabalhada(Double qtdHoraTrabalhada) {
        this.qtdHoraTrabalhada = qtdHoraTrabalhada;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = prime * result + ((valorHoraTrabalhada == null) ? 0 : valorHoraTrabalhada.hashCode());
        result = prime * result + ((qtdHoraTrabalhada == null) ? 0 : qtdHoraTrabalhada.hashCode());
        result = prime * result + ((desconto == null) ? 0 : desconto.hashCode());
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
        Funcionario other = (Funcionario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cargo == null) {
            if (other.cargo != null)
                return false;
        } else if (!cargo.equals(other.cargo))
            return false;
        if (valorHoraTrabalhada == null) {
            if (other.valorHoraTrabalhada != null)
                return false;
        } else if (!valorHoraTrabalhada.equals(other.valorHoraTrabalhada))
            return false;
        if (qtdHoraTrabalhada == null) {
            if (other.qtdHoraTrabalhada != null)
                return false;
        } else if (!qtdHoraTrabalhada.equals(other.qtdHoraTrabalhada))
            return false;
        if (desconto == null) {
            if (other.desconto != null)
                return false;
        } else if (!desconto.equals(other.desconto))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario:" + nome +
                "\nCargo:" + cargo +
                "\nValor da Hora Trabalhada:" + valorHoraTrabalhada +
                "\nQuantidade Hora Trabalhada:" + qtdHoraTrabalhada;

    }

    public Double calcularSalario() {
        Double salarioBruto = this.qtdHoraTrabalhada * this.valorHoraTrabalhada;
        return salarioBruto;
    }

    public Double calcularDescontoFixo() {
        Double salario = calcularSalario();
        Double descontoSalario = (salario * 0.15);
        return descontoSalario;
    }

    public Double calcularDesconto(Double salarioComDesconto) {
        Double salario = calcularSalario();

        salarioComDesconto = (salario - desconto);

        return desconto;
    }

}