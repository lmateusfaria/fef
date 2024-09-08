package model;

/**
 * Livro
 */
public class Livro {
    private String titulo;
    private String autor;
    private Integer numero_de_paginas;
    private Boolean flag;
    
    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.numero_de_paginas = 0;
        this.flag = null;
    }

    public Livro(String titulo, String autor, Integer numero_de_paginas, Boolean flag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_de_paginas = numero_de_paginas;
        this.flag = flag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumero_de_paginas() {
        return numero_de_paginas;
    }

    public void setNumero_de_paginas(Integer numero_de_paginas) {
        this.numero_de_paginas = numero_de_paginas;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String toString() {
        return "Livro:" +
                "\nTitulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nNumero de paginas: " + this.numero_de_paginas +
                "\nFlag: " +this.flag;
    }

    public Boolean empresta() {
        return false;
    }

    public Boolean devolve() {
        return true;
    }

}