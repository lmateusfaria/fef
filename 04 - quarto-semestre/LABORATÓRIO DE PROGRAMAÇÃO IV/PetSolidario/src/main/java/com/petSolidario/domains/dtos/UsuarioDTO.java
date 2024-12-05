package com.petSolidario.domains.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.petSolidario.domains.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioDTO {
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro = LocalDate.now();

    @NotNull(message = "O campo email não pode ser nulo!")
    @NotBlank(message = "O campo email não pode ser vazio!")
    private String email;

    @NotNull(message = "O campo senha não pode ser nulo!")
    @NotBlank(message = "O campo senha não pode ser vazio!")
    private String senha;

    @NotNull(message = "O campo nome não pode ser nulo!")
    @NotBlank(message = "O campo nome não pode ser vazio!")
    private String nome;

    @NotNull(message = "O campo sexo não pode ser nulo!")
    @NotBlank(message = "O campo sexo não pode ser vazio!")
    private String sexo;

    @NotNull(message = "O campo cpf não pode ser nulo!")
    @NotBlank(message = "O campo cpf não pode ser vazio!")
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento ;

    private List<Long> instituicoes ;

    private List<Long> animais;

    private List<Long> produtos;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.dataCadastro = usuario.getDataCadastro();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
        this.nome = usuario.getNome();
        this.sexo = usuario.getSexo();
        this.cpf = usuario.getCpf();
        this.dataNascimento = usuario.getDataNascimento();

        this.instituicoes = usuario.getInstituicoes().stream()
                .map(instituicao -> instituicao.getId()) // Obter IDs das instituições
                .collect(Collectors.toList());;
        ;
        this.animais = usuario.getAnimais().stream()
                .map(animal -> animal.getId())
                .collect(Collectors.toList());

        this.produtos = usuario.getProdutos().stream()
                .map(produto -> produto.getId())
                .collect(Collectors.toList());
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

    public @NotNull(message = "O campo email não pode ser nulo!") @NotBlank(message = "O campo email não pode ser vazio!") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "O campo email não pode ser nulo!") @NotBlank(message = "O campo email não pode ser vazio!") String email) {
        this.email = email;
    }

    public @NotNull(message = "O campo senha não pode ser nulo!") @NotBlank(message = "O campo senha não pode ser vazio!") String getSenha() {
        return senha;
    }

    public void setSenha(@NotNull(message = "O campo senha não pode ser nulo!") @NotBlank(message = "O campo senha não pode ser vazio!") String senha) {
        this.senha = senha;
    }

    public @NotNull(message = "O campo nome não pode ser nulo!") @NotBlank(message = "O campo nome não pode ser vazio!") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo nome não pode ser nulo!") @NotBlank(message = "O campo nome não pode ser vazio!") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "O campo sexo não pode ser nulo!") @NotBlank(message = "O campo sexo não pode ser vazio!") String getSexo() {
        return sexo;
    }

    public void setSexo(@NotNull(message = "O campo sexo não pode ser nulo!") @NotBlank(message = "O campo sexo não pode ser vazio!") String sexo) {
        this.sexo = sexo;
    }

    public @NotNull(message = "O campo cpf não pode ser nulo!") @NotBlank(message = "O campo cpf não pode ser vazio!") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotNull(message = "O campo cpf não pode ser nulo!") @NotBlank(message = "O campo cpf não pode ser vazio!") String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Long> getInstituicoes() {
        return instituicoes;
    }

    public void setInstituicoes(List<Long> instituicoes) {
        this.instituicoes = instituicoes;
    }

    public List<Long> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Long> animais) {
        this.animais = animais;
    }

    public List<Long> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Long> produtos) {
        this.produtos = produtos;
    }
}
