package model;

public class Conta {
    private String banco;
    private String numeroAgencia;
    private String numeroConta;
    private Double saldoAtual;
    
    public Conta() {
        this.banco = "";
        this.numeroAgencia = "";
        this.numeroConta = "";
        this.saldoAtual = 0.0;
    }
    
    public Conta(String banco, String numeroAgencia, String numeroConta, Double saldoAtual) {
        this.banco = banco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldoAtual = saldoAtual;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    @Override
    public String toString() {
        return "Dados Conta\n"+
        "\nBanco: " + this.banco +
        "\nNumero Agencia:" + this.numeroAgencia +
        "\nNumero Conta:" + this.numeroConta+
        "\nSaldo Atual:" + this.saldoAtual;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((banco == null) ? 0 : banco.hashCode());
        result = prime * result + ((numeroAgencia == null) ? 0 : numeroAgencia.hashCode());
        result = prime * result + ((numeroConta == null) ? 0 : numeroConta.hashCode());
        result = prime * result + ((saldoAtual == null) ? 0 : saldoAtual.hashCode());
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
        Conta other = (Conta) obj;
        if (banco == null) {
            if (other.banco != null)
                return false;
        } else if (!banco.equals(other.banco))
            return false;
        if (numeroAgencia == null) {
            if (other.numeroAgencia != null)
                return false;
        } else if (!numeroAgencia.equals(other.numeroAgencia))
            return false;
        if (numeroConta == null) {
            if (other.numeroConta != null)
                return false;
        } else if (!numeroConta.equals(other.numeroConta))
            return false;
        if (saldoAtual == null) {
            if (other.saldoAtual != null)
                return false;
        } else if (!saldoAtual.equals(other.saldoAtual))
            return false;
        return true;
    }

    public String deposita( Double valor) {
        String mensagem = "";
        this.saldoAtual += valor;
        mensagem="Deposito realizado com sucesso!";
        return mensagem;
    }
    
    public String saca( Double valor) {
        String mensagem = "";
        if(this.saldoAtual < valor){
            mensagem="Saque Indisponível! Saldo menor do que saque.";
        }else{
            this.saldoAtual -= valor;
            mensagem = "Retire as notas na boca do caixa.";
        }
        return mensagem;
    }
    

}
