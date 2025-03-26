package com.petSolidario.newDomain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.petSolidario.domains.dtos.UsuarioDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "newUsuario")
public class NewUsuario extends NewPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String email;

    @NotNull
    @NotBlank
    private String senha;

    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    @NotBlank
    private String sexo;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @JsonIgnore
    @OneToMany(mappedBy = "newUsuario")
    private List<NewAnimal> animais = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "newUsuario")
    private List<NewProduto> newProdutos = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "newUsuario")
    private List<NewInstituicao> instituicoes = new ArrayList<>();

    public NewUsuario() {
    }

    public NewUsuario(UsuarioDTO dto) {
        this.id = dto.getId();
        this.dataCadastro = dto.getDataCadastro();
        this.email = dto.getEmail();
        this.senha = dto.getSenha();
        this.nome = dto.getNome();
        this.sexo = dto.getSexo();
        this.cpf = dto.getCpf();
        this.dataNascimento = dto.getDataNascimento();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public @NotNull @NotBlank String getEmail() {
        return email;
    }

    public void setEmail(@NotNull @NotBlank String email) {
        this.email = email;
    }

    public @NotNull @NotBlank String getSenha() {
        return senha;
    }

    public void setSenha(@NotNull @NotBlank String senha) {
        this.senha = senha;
    }

    public @NotNull @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotNull @NotBlank String nome) {
        this.nome = nome;
    }

    public @NotNull @NotBlank String getSexo() {
        return sexo;
    }

    public void setSexo(@NotNull @NotBlank String sexo) {
        this.sexo = sexo;
    }

    public @NotNull @NotBlank String getCpf() {
        return cpf;
    }

    public void setCpf(@NotNull @NotBlank String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<NewAnimal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<NewAnimal> animais) {
        this.animais = animais;
    }

    public List<NewProduto> getProdutos() {
        return newProdutos;
    }

    public void setProdutos(List<NewProduto> newProdutos) {
        this.newProdutos = newProdutos;
    }

    public List<NewInstituicao> getInstituicoes() {
        return instituicoes;
    }

    public void setInstituicoes(List<NewInstituicao> instituicoes) {
        this.instituicoes = instituicoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewUsuario newUsuario = (NewUsuario) o;
        return Objects.equals(id, newUsuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
