package com.petSolidario.domains;

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
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @NotNull @NotBlank
    @Column(unique = true)
    private String email;

    @NotNull @NotBlank
    private String senha;

    @NotNull @NotBlank
    private String nome;

    @NotNull @NotBlank
    private String sexo;

    @NotNull @NotBlank
    @Column(unique = true)
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario")
    private List<Animal> animais = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "usuario")
    private List<Produto> produtos = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "usuario")
    private List<Instituicao> instituicoes = new ArrayList<>();

    public Usuario() {

    }

    public Usuario(Long id, LocalDate dataCadastro, String email, String senha, String nome, String sexo, String cpf, LocalDate dataNascimento, List<Instituicao> instituicoes, List<Animal> animais, List<Produto> produtos) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.instituicoes = instituicoes;
        this.animais = animais;
        this.produtos = produtos;
    }

    public Usuario(UsuarioDTO dto) {
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

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Instituicao> getInstituicoes() {
        return instituicoes;
    }

    public void setInstituicoes(List<Instituicao> instituicoes) {
        this.instituicoes = instituicoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
