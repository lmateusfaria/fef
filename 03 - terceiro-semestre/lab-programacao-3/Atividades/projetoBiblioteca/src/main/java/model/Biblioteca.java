package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author FELIPE
 */
public class Biblioteca {
    private String adicionar;
    private String emprestar;
    private String devolver;
    private String listar;
    
    public Biblioteca(){
        this.adicionar = "";
        this.emprestar = "";
        this.devolver = "";
        this.listar="";
    
    }

    public String getAdicionar() {
        return adicionar;
    }

    public void setAdicionar(String adicionar) {
        this.adicionar = adicionar;
    }

    public String getEmprestar() {
        return emprestar;
    }

    public void setEmprestar(String emprestar) {
        this.emprestar = emprestar;
    }

    public String getDevolver() {
        return devolver;
    }

    public void setDevolver(String devolver) {
        this.devolver = devolver;
    }

    public String getListar() {
        return listar;
    }

    public void setListar(String listar) {
        this.listar = listar;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "adicionar=" + adicionar + ", emprestar=" + emprestar + ", devolver=" + devolver + ", listar=" + listar + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.adicionar);
        hash = 71 * hash + Objects.hashCode(this.emprestar);
        hash = 71 * hash + Objects.hashCode(this.devolver);
        hash = 71 * hash + Objects.hashCode(this.listar);
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
        final Biblioteca other = (Biblioteca) obj;
        if (!Objects.equals(this.adicionar, other.adicionar)) {
            return false;
        }
        if (!Objects.equals(this.emprestar, other.emprestar)) {
            return false;
        }
        if (!Objects.equals(this.devolver, other.devolver)) {
            return false;
        }
        return Objects.equals(this.listar, other.listar);
    }
    public void Exibir(){
        List<Controle> lista = new ArrayList<>();
        
        
    }
}
