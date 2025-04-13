package br.com.fef.pokemon.domains.dtos;

import br.com.fef.pokemon.domains.Pokemon;
import br.com.fef.pokemon.domains.enums.TipoPokemon;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PokemonDTO {

    private Long id;

    @NotNull(message = "O campo nome não pode ser nulo!")
    @NotBlank(message = "O campo nome não pode estar vazio!")
    private String nome;

    @NotNull(message = "O campo tipoPokemon é obrigatório!")
    private int tipoPokemon;

    @NotNull(message = "O campo tipoPokemon é obrigatório!")
    private int nivelPokemon;

    @NotNull(message = "O campo pontos de vida não pode ser nulo!")
    @Digits(integer = 15, fraction = 0, message = "Pontos de vida deve ter até 15 dígitos e nenhuma casa decimal")
    private Integer pontosDeVida;

    @NotNull(message = "O campo ataque não pode ser nulo!")
    @Digits(integer = 15, fraction = 0, message = "Ataque deve ter até 15 dígitos e nenhuma casa decimal")
    private Integer ataque;

    @NotNull(message = "O campo defesa não pode ser nulo!")
    @Digits(integer = 15, fraction = 0, message = "Defesa deve ter até 15 dígitos e nenhuma casa decimal")
    private Integer defesa;

    @NotNull(message = "O campo velocidade não pode ser nulo!")
    @Digits(integer = 15, fraction = 0, message = "Velocidade deve ter até 15 dígitos e nenhuma casa decimal")
    private Integer velocidade;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCaptura;

    @NotNull(message = "O campo CPF do Pokémon não pode ser nulo!")
    @NotBlank(message = "O campo CPF do Pokémon não pode estar vazio!")
    @CPF
    private String cpfPokemon;

    public PokemonDTO() {
    }

    public PokemonDTO(Long id, String nome, int tipoPokemon,int nivelPokemon, Integer pontosDeVida, Integer ataque, Integer defesa, Integer velocidade, LocalDate dataCaptura, String cpfPokemon) {
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

    public PokemonDTO(Pokemon poke) {
        this.id = poke.getId();
        this.nome = poke.getNome();
        this.tipoPokemon = poke.getTipoPokemon().getId();
        this.nivelPokemon = poke.getNivelPokemon().getId();
        this.pontosDeVida = poke.getPontosDeVida();
        this.ataque = poke.getAtaque();
        this.defesa = poke.getDefesa();
        this.velocidade = poke.getVelocidade();
        this.dataCaptura = poke.getDataCaptura();
        this.cpfPokemon = poke.getCpfPokemon();
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

    public int getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(int tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public int getNivelPokemon() {
        return nivelPokemon;
    }

    public void setNivelPokemon(int nivelPokemon) {
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
