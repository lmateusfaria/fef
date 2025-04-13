package br.com.fef.pokemon.services;

import br.com.fef.pokemon.domains.Pokemon;
import br.com.fef.pokemon.domains.enums.NivelPokemon;
import br.com.fef.pokemon.domains.enums.TipoPokemon;
import br.com.fef.pokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private PokemonRepository pokeRepo;

    public void initDB() {

        Pokemon pokemon01 = new Pokemon(null, "LuisMateus_Pokemon", TipoPokemon.VOADOR, NivelPokemon.LENDARIO ,10000,10000,10000,10000, LocalDate.now(), "492.574.408-93");

        pokeRepo.save(pokemon01);

    }

}
