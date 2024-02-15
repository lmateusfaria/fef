package model;
public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;

    public Aluno() {
        this.nome = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
        this.nota4 = 0.0;
        this.media = 0.0;
    }

    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4, double media) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        long temp;
        temp = Double.doubleToLongBits(nota1);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(nota2);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(nota3);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(nota4);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(media);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Double.doubleToLongBits(nota1) != Double.doubleToLongBits(other.nota1))
            return false;
        if (Double.doubleToLongBits(nota2) != Double.doubleToLongBits(other.nota2))
            return false;
        if (Double.doubleToLongBits(nota3) != Double.doubleToLongBits(other.nota3))
            return false;
        if (Double.doubleToLongBits(nota4) != Double.doubleToLongBits(other.nota4))
            return false;
        if (Double.doubleToLongBits(media) != Double.doubleToLongBits(other.media))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4
                + ", media=" + media + "]";
    }
    
    public void calcularMedia() {
        this.media = (this.nota1+this.nota2+this.nota3+this.nota4)/4;
    }

}
