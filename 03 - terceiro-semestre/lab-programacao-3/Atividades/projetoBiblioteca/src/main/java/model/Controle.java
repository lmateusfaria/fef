package model;

import java.util.Objects;

/**
 *
 * @author FELIPE
 */
public class Controle {
    private String nomeLivro;
    private String nomeAutor;
    private String temaLivro;
    private boolean emprestaLivro;
    private double numPagi;
    
    
    
    public Controle(){
        this.nomeLivro = "";
        this.nomeAutor = "";
        this.temaLivro = "";
        this.emprestaLivro = true;
        this.numPagi = 0.0;
        
    }

    public boolean isEmprestaLivro() {
        return emprestaLivro;
    }

    public void setEmprestaLivro(boolean emprestaLivro) {
        this.emprestaLivro = emprestaLivro;
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
    public String toString() {
        return "Controle{" + "nomeLivro=" + nomeLivro + ", nomeAutor=" + nomeAutor + ", temaLivro=" + temaLivro + ", emprestaLivro=" + emprestaLivro + ", numPagi=" + numPagi + '}';
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nomeLivro);
        hash = 37 * hash + Objects.hashCode(this.nomeAutor);
        hash = 37 * hash + Objects.hashCode(this.temaLivro);
        hash = 37 * hash + Objects.hashCode(this.emprestaLivro);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.numPagi) ^ (Double.doubleToLongBits(this.numPagi) >>> 32));
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
        final Controle other = (Controle) obj;
        if (Double.doubleToLongBits(this.numPagi) != Double.doubleToLongBits(other.numPagi)) {
            return false;
        }
        if (!Objects.equals(this.nomeLivro, other.nomeLivro)) {
            return false;
        }
        if (!Objects.equals(this.nomeAutor, other.nomeAutor)) {
            return false;
        }
        if (!Objects.equals(this.temaLivro, other.temaLivro)) {
            return false;
        }
        return Objects.equals(this.emprestaLivro, other.emprestaLivro);
    }
        public void livroDisp(){
            
}
public void AdicionarLivro(){
    
}
}

