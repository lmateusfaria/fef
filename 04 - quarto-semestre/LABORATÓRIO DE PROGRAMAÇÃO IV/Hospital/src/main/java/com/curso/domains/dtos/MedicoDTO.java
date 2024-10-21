package com.curso.domains.dtos;

import com.curso.domains.Medico;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MedicoDTO {


    private long idMedico;

    @NotNull(message="O campo nomeMed nao pode ser nulo")
    @NotBlank(message="o campo nomeMed nao pode estar vazio")
    private String nomeMed;

    @JsonFormat(pattern ="dd/MM/yyyy")
    private LocalDate dataContratacao;

    @NotNull(message = "O campo salario nao pode ser nulo")
    @Digits(integer=15, fraction=3)
    private BigDecimal salario;

    public MedicoDTO(Medico medico){
        this.idMedico = medico.getIdMedico();
        this.nomeMed = medico.getNomeMed();
        this.dataContratacao = medico.getDataContratacao();
        this.salario = medico.getSalario();
    }

    public long getIdMedico(){
        return idMedico;
    }

    public void setIdMedico(long idPaciente){
        this.idMedico = idMedico;
    }

    public String getNomeMed() {
        return nomeMed;
    }

    public void setNomeMed(String nomeMed) {
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
}