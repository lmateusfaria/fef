package model;

import java.time.LocalDateTime;

/**
 * Funcionario
 */
public class Funcionario {
    private String nome;
    private String dataNascimento;
    private String Entrada;
    private String Saida;

    public Funcionario(){
        this.nome = "";
        this.dataNascimento = "";
        this.Entrada = "";
        this.Saida = "";
        
    }

    public Funcionario(String nome, String dataNascimento, String entrada, String saida) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.Entrada = entrada;
        this.Saida = saida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEntrada() {
        return Entrada;
    }

    public void setEntrada(String entrada) {
        Entrada = entrada;
    }

    public String getSaida() {
        return Saida;
    }

    public void setSaida(String saida) {
        Saida = saida;
    }



    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
        result = prime * result + ((Entrada == null) ? 0 : Entrada.hashCode());
        result = prime * result + ((Saida == null) ? 0 : Saida.hashCode());
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
        if (dataNascimento == null) {
            if (other.dataNascimento != null)
                return false;
        } else if (!dataNascimento.equals(other.dataNascimento))
            return false;
        if (Entrada == null) {
            if (other.Entrada != null)
                return false;
        } else if (!Entrada.equals(other.Entrada))
            return false;
        if (Saida == null) {
            if (other.Saida != null)
                return false;
        } else if (!Saida.equals(other.Saida))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + ",\nData de Nascimento: " + dataNascimento;
    }

    public String PontoEntrada() {
        LocalDateTime dataHora = LocalDateTime.now(); 
        
        
        return "Ponto de Entrada: "+dataHora;
    }

    public String PontoSaida() {
        LocalDateTime dataHora = LocalDateTime.now(); 
        
        
        return "Ponto de Saida: "+dataHora;
    }

    


} 
