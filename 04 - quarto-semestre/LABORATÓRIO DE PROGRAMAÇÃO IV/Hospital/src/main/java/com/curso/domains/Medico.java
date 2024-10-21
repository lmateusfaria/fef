package com.curso.domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_medico")
    private long idMedico;

    @NotNull @NotBlank
    private String nomeMed;

    @JsonFormat
            (pattern = "dd/MM/yyyy")
    private LocalDate dataContratacao;

    @NotNull
    @Digits(integer = 15, fraction = 3)
    private BigDecimal salario;

    public Medico() {this.salario = BigDecimal.ZERO;}

    public Medico(long idMedico, String nomeMed, LocalDate dataContratacao, BigDecimal salario) {
        this.idMedico = idMedico;
        this.nomeMed = nomeMed;
        this.dataContratacao = dataContratacao;
        this.salario = salario;

    }

    public long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(long idMedico) {
        this.idMedico = idMedico;
    }

    public @NotNull @NotBlank String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(@NotNull @NotBlank String nomeMed) {
        this.nomeMed = nomeMed;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return idMedico == medico.idMedico && Objects.equals(nomeMed, medico.nomeMed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMedico, nomeMed);
    }
}