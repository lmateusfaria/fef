package com.biblioteca.resources;

import com.biblioteca.domains.Editora;
import com.biblioteca.domains.Livro;
import com.biblioteca.domains.dtos.EditoraDTO;
import com.biblioteca.domains.dtos.LivroDTO;
import com.biblioteca.services.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/livro")
public class LivroResource {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public ResponseEntity<List<LivroDTO>> findAll(){
        return ResponseEntity.ok().body(livroService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<LivroDTO> findbyId(@PathVariable Integer id){
        Livro obj = this.livroService.findbyId(id);
        return ResponseEntity.ok().body(new LivroDTO(obj));
    }

    @GetMapping(value = "/isbn/{isbn}")
    public ResponseEntity<LivroDTO> findbyId(@PathVariable String isbn){
        Livro obj = this.livroService.findbyIsbn(isbn);
        return ResponseEntity.ok().body(new LivroDTO(obj));
    }

    @PostMapping
    public ResponseEntity<LivroDTO> create(@Valid @RequestBody LivroDTO dto){
        Livro livro = livroService.create(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(livro.getIdLivro()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<LivroDTO> update(@PathVariable Integer id, @Valid @RequestBody LivroDTO objDto){
        Livro Obj = livroService.update(id,objDto);
        return ResponseEntity.ok().body(new LivroDTO(Obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<LivroDTO> delete(@PathVariable Integer id){
        livroService.delete(id);
        return ResponseEntity.noContent().build();
    }

}