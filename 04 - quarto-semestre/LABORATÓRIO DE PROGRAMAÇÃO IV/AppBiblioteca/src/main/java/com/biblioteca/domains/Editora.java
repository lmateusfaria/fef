package com.biblioteca.domains;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;


@Entity
@Table(name = "editora")
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_editora")
    private int id;

    @NotNull @NotBlank
    private String cnpj;

    @NotNull @NotBlank
    private String razaoSocial;

    public Editora() {
    }

    public Editora(int id, String cnpj, String razaoSocial) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotNull @NotBlank String getCnpj() {
        return cnpj;
    }

    public void setCnpj(@NotNull @NotBlank String cnpj) {
        this.cnpj = cnpj;
    }

    public @NotNull @NotBlank String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(@NotNull @NotBlank String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editora editora = (Editora) o;
        return id == editora.id && Objects.equals(cnpj, editora.cnpj) && Objects.equals(razaoSocial, editora.razaoSocial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cnpj, razaoSocial);
    }
}
