package model;

import java.util.Objects;

/**
 *
 * @author FELIPE
 */
public class Livro {

    private String nomeLivro;
    private String nomeAutor;
    private String temaLivro;
    private double numPagi;
    boolean controleLivro;

    public Livro() {
        this.nomeLivro = "";
        this.nomeAutor = "";
        this.temaLivro = "";
        this.numPagi = 0.0;
        this.controleLivro = true;

    }

    public boolean isControleLivro() {
        return controleLivro;
    }

    public void setControleLivro(boolean controleLivro) {
        this.controleLivro = controleLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getTemaLivro() {
        return temaLivro;
    }

    public void setTemaLivro(String temaLivro) {
        this.temaLivro = temaLivro;
    }

    public double getNumPagi() {
        return numPagi;
    }

    public void setNumPagi(double numPagi) {
        this.numPagi = numPagi;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nomeLivro);
        hash = 67 * hash + Objects.hashCode(this.nomeAutor);
        hash = 67 * hash + Objects.hashCode(this.temaLivro);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.numPagi) ^ (Double.doubleToLongBits(this.numPagi) >>> 32));
        hash = 67 * hash + (this.controleLivro ? 1 : 0);
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
        final Livro other = (Livro) obj;
        if (Double.doubleToLongBits(this.numPagi) != Double.doubleToLongBits(other.numPagi)) {
            return false;
        }
        if (this.controleLivro != other.controleLivro) {
            return false;
        }
        if (!Objects.equals(this.nomeLivro, other.nomeLivro)) {
            return false;
        }
        if (!Objects.equals(this.nomeAutor, other.nomeAutor)) {
            return false;
        }
        return Objects.equals(this.temaLivro, other.temaLivro);
    }

    @Override
    public String toString() {
        return "Livro{" + "nomeLivro=" + nomeLivro + ", nomeAutor=" + nomeAutor + ", temaLivro=" + temaLivro + ", numPagi=" + numPagi + ", controleLivro=" + controleLivro + '}';
    }

    public Boolean emprestar() {
        return true;
    }

    public Boolean devolver() {
        return false;
    }
}
