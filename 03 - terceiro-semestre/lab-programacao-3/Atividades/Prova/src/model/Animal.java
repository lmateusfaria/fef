package model;

public abstract class Animal {
    private String nome;
    private Integer idade;
    private Boolean alimentado;

    

    public Animal() {
        this.nome = "";
        this.idade = 0;
        this.alimentado = false;
    }
    
    public Animal(String nome, Integer idade, Boolean alimentado) {
        this.nome = nome;
        this.idade = idade;
        this.alimentado = alimentado;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Boolean getAlimentado() {
        return alimentado;
    }

    public void setAlimentado(Boolean alimentado) {
        this.alimentado = alimentado;
    }

    public abstract String somCaracteristico();

    public abstract void alimentarAnimal(Animal animal);

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((idade == null) ? 0 : idade.hashCode());
        result = prime * result + ((alimentado == null) ? 0 : alimentado.hashCode());
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
        Animal other = (Animal) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (idade == null) {
            if (other.idade != null)
                return false;
        } else if (!idade.equals(other.idade))
            return false;
        if (alimentado == null) {
            if (other.alimentado != null)
                return false;
        } else if (!alimentado.equals(other.alimentado))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\nAnimal\nNome: " + nome +
        "\nIdade: " + idade+
        "\nAlimentado: " + alimentado;
    }   
    
}
