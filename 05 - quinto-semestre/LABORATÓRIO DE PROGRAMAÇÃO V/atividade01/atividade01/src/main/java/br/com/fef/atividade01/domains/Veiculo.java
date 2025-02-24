package br.com.fef.atividade01.domains;

import br.com.fef.atividade01.domains.dtos.VeiculoDTO;
import br.com.fef.atividade01.domains.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo_id_seq")
    private Long id;

    @NotNull @NotBlank
    private String descricao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAquisicao;

    @NotNull
    @Digits(integer = 10, fraction = 2)
    private BigDecimal valorAquisicao;

    @NotNull @NotBlank
    private String nomeProprietario;

    @NotNull @NotBlank
    @Column(unique = true)
    private String cpfProprietario;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "status_id")
    private Status status;


    public Veiculo() {
        this.status = Status.DISPONIVEL;
    }

    public Veiculo(VeiculoDTO dto){
        this.id = dto.getId();
        this.descricao = dto.getDescricao();
        this.dataAquisicao = dto.getDataAquisicao();
        this.valorAquisicao = dto.getValorAquisicao();
        this.nomeProprietario = dto.getNomeProprietario();
        this.cpfProprietario = dto.getCpfProprietario();
        this.status = Status.toEnum(dto.getStatus());
    }

    public Veiculo(Long id, String descricao, LocalDate dataAquisicao, BigDecimal valorAquisicao, String nomeProprietario, String cpfProprietario, Status status) {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(id, veiculo.id) && Objects.equals(descricao, veiculo.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao);
    }
}
