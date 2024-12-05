package com.petSolidario.domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.petSolidario.domains.dtos.InstituicaoDTO;
import com.petSolidario.domains.enums.Situacao;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "instituicao")
public class Instituicao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_instituicao")
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @NotNull @NotBlank
    private String nome;

    @NotNull @NotBlank
    @Column(unique = true)
    private String cnpj;

    @NotNull @NotBlank
    private String razaoSocial;

    @ManyToOne
    @JoinColumn(name="idusuario")
    private Usuario usuario;

    @JsonIgnore
    @OneToMany(mappedBy = "instituicao")
    private List<Produto> produtos = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "instituicao")
    private List<Animal> animais = new ArrayList<>();

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "situacao")
    private Situacao situacao;

    public Instituicao() {

    }

    public Instituicao(Long id, LocalDate dataCadastro, String nome, String cnpj, String razaoSocial, List<Produto> produtos, Usuario usuario, List<Animal> animais, Situacao situacao) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.produtos = produtos;
        this.usuario = usuario;
        this.animais = animais;
        this.situacao = situacao;
    }

    public Instituicao(InstituicaoDTO dto) {
        this.id = dto.getId();
        this.dataCadastro = dto.getDataCadastro();
        this.nome = dto.getNome();
        this.cnpj = dto.getCnpj();
        this.razaoSocial = dto.getRazaoSocial();
        this.usuario = new Usuario();
        this.usuario.setId(dto.getUsuario());
        this.situacao = Situacao.toEnum(dto.getSituacao());
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

    public @NotNull @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotNull @NotBlank String nome) {
        this.nome = nome;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituicao that = (Instituicao) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
