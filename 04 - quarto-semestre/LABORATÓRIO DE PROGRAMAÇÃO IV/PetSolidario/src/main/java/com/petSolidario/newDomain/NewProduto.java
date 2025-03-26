package com.petSolidario.newDomain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.petSolidario.domains.dtos.ProdutoDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name = "newProduto")
public class NewProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @NotNull @NotBlank
    private String nome;

    @NotNull
    @Digits(integer = 15,fraction = 3)
    private BigDecimal peso;

    @NotNull @NotBlank
    @Column(unique = true)
    private String codigoDeBarras;

    @ManyToOne
    @JoinColumn(name="idinstituicao")
    private NewInstituicao newInstituicao;

    @ManyToOne
    @JoinColumn(name="idusuario")
    private NewUsuario newUsuario;

    public NewProduto() {
    }

    public NewProduto(Long id, LocalDate dataCadastro, String nome, BigDecimal peso, String codigoDeBarras, NewInstituicao newInstituicao, NewUsuario newUsuario) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.peso = peso;
        this.codigoDeBarras = codigoDeBarras;
        this.newInstituicao = newInstituicao;
        this.newUsuario = newUsuario;
    }

    public NewProduto(ProdutoDTO dto) {
        this.id = dto.getId();
        this.dataCadastro = dto.getDataCadastro();
        this.nome = dto.getNome();
        this.peso = dto.getPeso();
        this.codigoDeBarras = dto.getCodigoDeBarras();
        this.newInstituicao = new NewInstituicao();
        this.newInstituicao.setId(dto.getInstituicao());
        this.newUsuario = new NewUsuario();
        this.newUsuario.setId(dto.getUsuario());
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

    public @NotNull @Digits(integer = 15, fraction = 3) BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(@NotNull @Digits(integer = 15, fraction = 3) BigDecimal peso) {
        this.peso = peso;
    }

    public @NotNull @NotBlank String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(@NotNull @NotBlank String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public NewInstituicao getInstituicao() {
        return newInstituicao;
    }

    public void setInstituicao(NewInstituicao newInstituicao) {
        this.newInstituicao = newInstituicao;
    }

    public NewUsuario getUsuario() {
        return newUsuario;
    }

    public void setUsuario(NewUsuario newUsuario) {
        this.newUsuario = newUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewProduto newProduto = (NewProduto) o;
        return Objects.equals(id, newProduto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
