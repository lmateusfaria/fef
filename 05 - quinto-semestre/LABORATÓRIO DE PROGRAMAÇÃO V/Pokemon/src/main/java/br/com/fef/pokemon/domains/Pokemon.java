package br.com.fef.pokemon.domains;


import br.com.fef.pokemon.domains.dtos.PokemonDTO;
import br.com.fef.pokemon.domains.enums.NivelPokemon;
import br.com.fef.pokemon.domains.enums.TipoPokemon;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pokemon")
    private Long id;

    @NotBlank
    @NotNull
    private String nome;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "tipoPokemon")
    private TipoPokemon tipoPokemon;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "nivelPokemon")
    private NivelPokemon nivelPokemon;

    @NotNull
    @Digits(integer = 15, fraction = 0)
    private Integer pontosDeVida;

    @NotNull
    @Digits(integer = 15, fraction = 0)
    private Integer ataque;

    @NotNull
    @Digits(integer = 15, fraction = 0)
    private Integer defesa;

    @NotNull
    @Digits(integer = 15, fraction = 0)
    private Integer velocidade;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCaptura;

    @NotBlank
    @NotNull
    private String cpfPokemon;

    public Pokemon() {
    }

    public Pokemon(Long id, String nome, TipoPokemon tipoPokemon,NivelPokemon nivelPokemon, Integer pontosDeVida, Integer ataque, Integer defesa, Integer velocidade, LocalDate dataCaptura, String cpfPokemon) {
        this.id = id;
        this.nome = nome;
        this.tipoPokemon = tipoPokemon;
        this.nivelPokemon = nivelPokemon;
        this.pontosDeVida = pontosDeVida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.dataCaptura = dataCaptura;
        this.cpfPokemon = cpfPokemon;
    }

    public Pokemon(PokemonDTO dto) {
        this.id = dto.getId();
        this.nome = dto.getNome();
        this.tipoPokemon = TipoPokemon.toEnum(dto.getTipoPokemon());
        this.nivelPokemon = NivelPokemon.toEnum(dto.getNivelPokemon());
        this.pontosDeVida = dto.getPontosDeVida();
        this.ataque = dto.getAtaque();
        this.defesa = dto.getDefesa();
        this.velocidade = dto.getVelocidade();
        this.dataCaptura = dto.getDataCaptura();
        this.cpfPokemon = dto.getCpfPokemon();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPokemon getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(TipoPokemon tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public NivelPokemon getNivelPokemon() {
        return nivelPokemon;
    }

    public void setNivelPokemon(NivelPokemon nivelPokemon) {
        this.nivelPokemon = nivelPokemon;
    }

    public Integer getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(Integer pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public LocalDate getDataCaptura() {
        return dataCaptura;
    }

    public void setDataCaptura(LocalDate dataCaptura) {
        this.dataCaptura = dataCaptura;
    }

    public String getCpfPokemon() {
        return cpfPokemon;
    }

    public void setCpfPokemon(String cpfPokemon) {
        this.cpfPokemon = cpfPokemon;
    }
}