/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author jeffe
 */
public class Conta {
    
    private String banco;
    private String numeroAgencia;
    private String numeroConta;
    private Double saldoAtual;
    
    public Conta() {
        this.banco="";
        this.numeroAgencia="";
        this.numeroConta="";
        this.saldoAtual=0.00;
    }

    public Conta(String banco, String numeroAgencia, String numeroConta, Double saldoAtual) {
        this.banco = banco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldoAtual = saldoAtual;
    }

    @Override
    public String toString() {
        return "Conta{" + "banco=" + banco + ", numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", saldoAtual=" + saldoAtual + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.banco);
        hash = 53 * hash + Objects.hashCode(this.numeroAgencia);
        hash = 53 * hash + Objects.hashCode(this.numeroConta);
        hash = 53 * hash + Objects.hashCode(this.saldoAtual);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (!Objects.equals(this.banco, other.banco)) {
            return false;
        }
        if (!Objects.equals(this.numeroAgencia, other.numeroAgencia)) {
            return false;
        }
        if (!Objects.equals(this.numeroConta, other.numeroConta)) {
            return false;
        }
        return Objects.equals(this.saldoAtual, other.saldoAtual);
    }
    
    public String deposita(double valor){
        String mensagem="";
        this.saldoAtual+=valor;
        mensagem="Deposito concluido com sucesso";
        return mensagem;
    }
    
    public String saca(double valor){
        String mensagem="";
        if (this.saldoAtual<valor){
            mensagem="Saldo Insuficiente!";
        } else {
            this.saldoAtual-=valor;
            mensagem="Aguarde a contagem das notas";
        }
        return mensagem;
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
    
    
}
