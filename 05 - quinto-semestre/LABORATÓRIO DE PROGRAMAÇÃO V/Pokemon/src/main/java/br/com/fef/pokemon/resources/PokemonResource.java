package br.com.fef.pokemon.resources;

import br.com.fef.pokemon.domains.Pokemon;
import br.com.fef.pokemon.domains.dtos.PokemonDTO;
import br.com.fef.pokemon.services.PokemonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pokemon")
public class PokemonResource {

    @Autowired
    private PokemonService pokeService;

    @GetMapping //exemplo http://localhost:8080/pokemon
    public ResponseEntity<List<PokemonDTO>> findAll(){
        return ResponseEntity.ok().body(pokeService.findAll());
    }

    @GetMapping(value = "/{id}") // exemplo http://localhost:8080/pokemon/1
    public ResponseEntity<PokemonDTO> findById(@PathVariable Long id){
        Pokemon obj = this.pokeService.findbyId(id);
        return ResponseEntity.ok().body(new PokemonDTO(obj));
    }

    @GetMapping(value = "/cpfPokemon/{cpfPokemon}") // exemplo http://localhost:8080/pokemon/cpfPokemon/1
    public ResponseEntity<PokemonDTO> findById(@PathVariable String cpfPokemon){
        Pokemon obj = this.pokeService.findbyCpfPokemon(cpfPokemon);
        return ResponseEntity.ok().body(new PokemonDTO(obj));
    }

    @PostMapping
    public ResponseEntity<PokemonDTO> create(@RequestBody PokemonDTO dto){

        Pokemon Pokemon = pokeService.create(dto);
        // Cria o URI para o recurso criado
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(Pokemon.getId()).toUri();
        // Retorna a resposta com o status 201 Created e o local do recurso criado
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PokemonDTO> delete(@PathVariable Long id){
        pokeService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PokemonDTO> update(@PathVariable Long id, @Valid @RequestBody PokemonDTO objDto){
        Pokemon Pokemon = pokeService.update(id,objDto);
        return ResponseEntity.ok().body(new PokemonDTO(Pokemon));
    }

}
