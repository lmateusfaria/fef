package com.petSolidario.newDomain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.petSolidario.domains.dtos.AnimalDTO;
import com.petSolidario.domains.enums.Porte;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "newAnimal")
public class NewAnimal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_animal")
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @NotNull @NotBlank
    @Column(unique = true)
    private String registro;

    @NotNull @NotBlank
    private String nome;

    @NotNull @NotBlank
    private String especie;

    @NotNull @NotBlank
    private String raca;

    @NotNull @NotBlank
    private String cor;

    @NotNull @NotBlank
    private String sexo;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;

    @ManyToOne
    @JoinColumn(name="idinstituicao")
    private NewInstituicao newInstituicao;

    @ManyToOne
    @JoinColumn(name="idusuario")
    private NewUsuario newUsuario;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "porte")
    private Porte porte;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "perfis")
    protected Set<Integer> personType = new HashSet<>();

    public NewAnimal() {

    }

    public NewAnimal(Long id, LocalDate dataCadastro, String registro, String nome, String especie, String raca, String cor, String sexo, Date dataNascimento, NewInstituicao newInstituicao, NewUsuario newUsuario, Porte porte) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.registro = registro;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.newInstituicao = newInstituicao;
        this.newUsuario = newUsuario;
        this.porte = porte;
    }

    public NewAnimal(AnimalDTO dto) {
        this.id = dto.getId();
        this.dataCadastro = dto.getDataCadastro();
        this.registro = dto.getRegistro();
        this.nome = dto.getNome();
        this.especie = dto.getEspecie();
        this.raca = dto.getRaca();
        this.cor = dto.getCor();
        this.sexo = dto.getSexo();
        this.dataNascimento = dto.getDataNascimento();
        this.newInstituicao = new NewInstituicao();
        this.newInstituicao.setId(dto.getInstituicao());
        this.newUsuario = new NewUsuario();
        this.newUsuario.setId(dto.getUsuario());
        this.porte = Porte.toEnum(dto.getPorte());
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

    public @NotNull @NotBlank String getRegistro() {
        return registro;
    }

    public void setRegistro(@NotNull @NotBlank String registro) {
        this.registro = registro;
    }

    public @NotNull @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotNull @NotBlank String nome) {
        this.nome = nome;
    }

    public @NotNull @NotBlank String getEspecie() {
        return especie;
    }

    public void setEspecie(@NotNull @NotBlank String especie) {
        this.especie = especie;
    }

    public @NotNull @NotBlank String getRaca() {
        return raca;
    }

    public void setRaca(@NotNull @NotBlank String raca) {
        this.raca = raca;
    }

    public @NotNull @NotBlank String getCor() {
        return cor;
    }

    public void setCor(@NotNull @NotBlank String cor) {
        this.cor = cor;
    }

    public @NotNull @NotBlank String getSexo() {
        return sexo;
    }

    public void setSexo(@NotNull @NotBlank String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewAnimal newAnimal = (NewAnimal) o;
        return Objects.equals(id, newAnimal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
