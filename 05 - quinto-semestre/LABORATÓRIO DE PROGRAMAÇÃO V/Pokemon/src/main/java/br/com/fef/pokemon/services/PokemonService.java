package br.com.fef.pokemon.services;

import br.com.fef.pokemon.domains.Pokemon;
import br.com.fef.pokemon.domains.dtos.PokemonDTO;
import br.com.fef.pokemon.repositories.PokemonRepository;
import br.com.fef.pokemon.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PokemonService {
    @Autowired
    private PokemonRepository pokemonRepo;

    public List<PokemonDTO> findAll(){
        //retorna uma lista de GrupoPokemonDTO
        return pokemonRepo.findAll().stream()
                .map(obj -> new PokemonDTO(obj))
                .collect(Collectors.toList());
    }

    public Pokemon findbyId(Long id){
        Optional<Pokemon> obj = pokemonRepo.findById(id);
        return obj.orElse(null);
    }

    public Pokemon findbyCpfPokemon(String cpfPokemon){
        Optional<Pokemon> obj = pokemonRepo.findByCpfPokemon(cpfPokemon);
        return obj.orElse(null);
    }

    public Pokemon create(PokemonDTO dto){
        dto.setId(null);
        validaCpfCadastro(dto);
        Pokemon obj = new Pokemon(dto);
        return pokemonRepo.save(obj);
    }

    public void delete(Long id){
        Pokemon obj = findbyId(id);
        if (obj != null ){
            pokemonRepo.deleteById(id);
        }
    }
    public Pokemon update(Long id, PokemonDTO objDto){
        objDto.setId(id);
        validaCpfUpdate(objDto);
        Pokemon oldObj = findbyId(id);
        oldObj = new Pokemon(objDto);
        return pokemonRepo.save(oldObj);
    }

    private void validaCpfCadastro(PokemonDTO objDto){
        Optional<Pokemon> obj = pokemonRepo.findByCpfPokemon(objDto.getCpfPokemon());
        if(obj.isPresent() && obj.get().getId() != objDto.getId()){
            throw new ObjectNotFoundException("CPF já cadastrado no sistema!");
        }
    }

    private void validaCpfUpdate(PokemonDTO objDto){
        Optional<Pokemon> obj = pokemonRepo.findByCpfPokemon(objDto.getCpfPokemon());
        if(obj.isPresent() && obj.get().getId() == objDto.getId()){
            throw new ObjectNotFoundException("CPF já cadastrado no sistema!");
        }
    }

}
