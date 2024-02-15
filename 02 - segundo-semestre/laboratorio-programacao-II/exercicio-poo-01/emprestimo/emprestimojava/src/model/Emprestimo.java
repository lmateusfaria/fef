package model;

public class Emprestimo {
    private String cliente;
    private String banco;
    private Double valorEmprestimo;
    private int numeroParcelas;
    private Double valorParcelasPagas;
    private Double valorParcelasPagar;
    private Double valorParcela;
    
    public Emprestimo() {
        this.cliente = "";
        this.banco = "";
        this.valorEmprestimo = 0.0;
        this.numeroParcelas = 0;
        this.valorParcelasPagas = 0.0;
        this.valorParcelasPagar = 0.0;
        this.valorParcela = 0.0;
    }


    public Emprestimo(String cliente, String banco, Double valorEmprestimo, int numeroParcelas,
        Double valorParcelasPagas, Double valorParcelasPagar, Double valorParcela) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorEmprestimo = valorEmprestimo;
        this.numeroParcelas = numeroParcelas;
        this.valorParcelasPagas = valorParcelasPagas;
        this.valorParcelasPagar = valorParcelasPagar;
        this.valorParcela = valorParcela;
    
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(Double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Double getValorParcelasPagas() {
        return valorParcelasPagas;
    }

    public void setValorParcelasPagas(Double valorParcelasPagas) {
        this.valorParcelasPagas = valorParcelasPagas;
    }

    public Double getValorParcelasPagar() {
        return valorParcelasPagar;
    }

    public void setValorParcelasPagar(Double valorParcelasPagar) {
        this.valorParcelasPagar = valorParcelasPagar;
    }

    
    public Double getValorParcela() {
        return valorParcela;
    }


    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((banco == null) ? 0 : banco.hashCode());
        result = prime * result + ((valorEmprestimo == null) ? 0 : valorEmprestimo.hashCode());
        result = prime * result + numeroParcelas;
        result = prime * result + ((valorParcelasPagas == null) ? 0 : valorParcelasPagas.hashCode());
        result = prime * result + ((valorParcelasPagar == null) ? 0 : valorParcelasPagar.hashCode());
        result = prime * result + ((valorParcela == null) ? 0 : valorParcela.hashCode());
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
        Emprestimo other = (Emprestimo) obj;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (banco == null) {
            if (other.banco != null)
                return false;
        } else if (!banco.equals(other.banco))
            return false;
        if (valorEmprestimo == null) {
            if (other.valorEmprestimo != null)
                return false;
        } else if (!valorEmprestimo.equals(other.valorEmprestimo))
            return false;
        if (numeroParcelas != other.numeroParcelas)
            return false;
        if (valorParcelasPagas == null) {
            if (other.valorParcelasPagas != null)
                return false;
        } else if (!valorParcelasPagas.equals(other.valorParcelasPagas))
            return false;
        if (valorParcelasPagar == null) {
            if (other.valorParcelasPagar != null)
                return false;
        } else if (!valorParcelasPagar.equals(other.valorParcelasPagar))
            return false;
        if (valorParcela == null) {
            if (other.valorParcela != null)
                return false;
        } else if (!valorParcela.equals(other.valorParcela))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "___INFORMAÇÕES DO EMPRESTIMO___\nCliente: " + cliente + "\nBanco: " + banco + "\nValor do Emprestimo: R$ " + valorEmprestimo
                + "\nNumero de Parcelas: " + numeroParcelas + "\nValor de Parcelas Pagas: R$ " + valorParcelasPagas
                + "\nValor de Parcelas a Pagar: R$ " + valorParcelasPagar + "\nValor da Parcela: R$ " +valorParcela +
                "\n___INFORMAÇÕES DO EMPRESTIMO___";
    }

    public String pagarParcela(double valorPago) {
        String mensagem="";

        if (this.valorParcelasPagar >= valorPago){
        
            this.valorParcelasPagar -= valorPago;
            this.valorParcelasPagas += valorPago;
            this.numeroParcelas--;
            
            mensagem = "Parcela de R$ "+valorPago+" Paga!";
        }else{
            mensagem = "O valor a pagar é menor que o pagamento a ser feito!";
        }

        return mensagem; 
    }

    public String calcularContrato() {
        String mensagem="Contrato Calculado!";
        
        this.valorParcelasPagar = this.valorEmprestimo;
        this.valorParcela = this.valorEmprestimo/this.numeroParcelas;

        return mensagem; 
    }
}
