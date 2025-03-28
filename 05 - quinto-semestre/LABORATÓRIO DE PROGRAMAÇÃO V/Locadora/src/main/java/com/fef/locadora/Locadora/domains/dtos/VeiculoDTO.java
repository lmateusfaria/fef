package com.fef.locadora.Locadora.domains.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fef.locadora.Locadora.domains.Veiculo;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class VeiculoDTO {
    private Long id;

    @NotNull(message = "O campo descrição não pode ser nulo!")
    private String descricao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAquisicao = LocalDate.now();

    @NotNull(message = "O campo valor de aquisição não pode ser nulo!")
    private BigDecimal valorAquisicao;

    @NotNull(message = "O campo nome do proprietário não pode ser nulo!")
    private String nomeProprietario;

    @NotNull(message = "O campo CPF não pode ser nulo!")
    private String cpf;

    private int situacao;

    public VeiculoDTO() {
    }

    public VeiculoDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.descricao = veiculo.getDescricao();
        this.valorAquisicao = veiculo.getValorAquisicao();
        this.nomeProprietario = veiculo.getNomeProprietario();
        this.cpf = veiculo.getCpf();
        this.situacao = veiculo.getSituacao().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public BigDecimal getValorAquisicao() {
        return valorAquisicao;
    }

    public void setValorAquisicao(BigDecimal valorAquisicao) {
        this.valorAquisicao = valorAquisicao;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }
}
