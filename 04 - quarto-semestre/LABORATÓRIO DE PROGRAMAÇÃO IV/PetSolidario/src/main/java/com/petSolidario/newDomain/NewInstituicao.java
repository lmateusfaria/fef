package com.petSolidario.newDomain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.petSolidario.domains.dtos.InstituicaoDTO;
import com.petSolidario.domains.enums.Situacao;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.*;


@Entity
@Table(name = "newInstituicao")
public class NewInstituicao extends NewPerson {

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
    private NewUsuario newUsuario;

    @JsonIgnore
    @OneToMany(mappedBy = "newInstituicao")
    private List<NewProduto> newProdutos = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "newInstituicao")
    private List<NewAnimal> animais = new ArrayList<>();

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "situacao")
    private Situacao situacao;

    public NewInstituicao() {
    }

    public NewInstituicao(Long id, LocalDate dataCadastro, String nome, String cnpj, String razaoSocial, List<NewProduto> newProdutos, NewUsuario newUsuario, List<NewAnimal> animais, Situacao situacao) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.newUsuario = newUsuario;
        this.newProdutos = newProdutos;
        this.animais = animais;
        this.situacao = situacao;
    }

    public NewInstituicao(InstituicaoDTO dto) {
        this.id = dto.getId();
        this.dataCadastro = dto.getDataCadastro();
        this.nome = dto.getNome();
        this.cnpj = dto.getCnpj();
        this.razaoSocial = dto.getRazaoSocial();
        this.newUsuario = new NewUsuario();
        this.newUsuario.setId(dto.getUsuario());
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

    public NewUsuario getUsuario() {
        return newUsuario;
    }

    public void setUsuario(NewUsuario newUsuario) {
        this.newUsuario = newUsuario;
    }

    public List<NewProduto> getProdutos() {
        return newProdutos;
    }

    public void setProdutos(List<NewProduto> newProdutos) {
        this.newProdutos = newProdutos;
    }

    public List<NewAnimal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<NewAnimal> animais) {
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
        NewInstituicao that = (NewInstituicao) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
