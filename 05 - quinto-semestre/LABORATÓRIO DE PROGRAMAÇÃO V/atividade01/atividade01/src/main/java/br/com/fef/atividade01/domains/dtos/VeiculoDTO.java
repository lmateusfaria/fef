package br.com.fef.atividade01.domains.dtos;

import br.com.fef.atividade01.domains.Veiculo;
import br.com.fef.atividade01.domains.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class VeiculoDTO {
    private Long id;

    @NotNull(message = "Descrição não pode ser nula")
    @NotBlank(message = "Descrição não pode ser vazia")
    private String descricao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAquisicao;

    @NotNull(message = "Valor de aquisição não pode ser nulo")
    @Digits(integer = 10, fraction = 2)
    private BigDecimal valorAquisicao;

    @NotNull(message = "Nome do proprietário não pode ser nulo")
    @NotBlank(message = "Nome do proprietário não pode ser vazio")
    private String nomeProprietario;

    @NotNull(message = "CPF do proprietário não pode ser nulo")
    @NotBlank(message = "CPF do proprietário não pode ser vazio")
    private String cpfProprietario;

    private int status;

    public VeiculoDTO() {
    }

    public VeiculoDTO(Veiculo veiculo) {

        this.id = veiculo.getId();
        this.descricao = veiculo.getDescricao();
        this.dataAquisicao = veiculo.getDataAquisicao();
        this.valorAquisicao = veiculo.getValorAquisicao();
        this.nomeProprietario = veiculo.getNomeProprietario();
        this.cpfProprietario = veiculo.getCpfProprietario();
        this.status = veiculo.getStatus().getId();

    }

    public VeiculoDTO(Long id, String descricao, LocalDate dataAquisicao, BigDecimal valorAquisicao, String nomeProprietario, String cpfProprietario, int status) {
        this.id = id;
        this.descricao = descricao;
        this.dataAquisicao = dataAquisicao;
        this.valorAquisicao = valorAquisicao;
        this.nomeProprietario = nomeProprietario;
        this.cpfProprietario = cpfProprietario;
        this.status = status;
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

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
