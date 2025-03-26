package com.curso.resources;

import com.curso.domains.Technician;
import com.curso.domains.dtos.TechnicianDTO;
import com.curso.services.TechnicianService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/technician")
public class TechnicianResource {

    @Autowired
    private TechnicianService technicianService;

    @GetMapping //exemplo http://localhost:8080/technician
    public ResponseEntity<List<TechnicianDTO>> findAll(){
        return ResponseEntity.ok().body(technicianService.findAll());
    }

    @GetMapping(value = "/{id}") // exemplo http://localhost:8080/technician/1
    public ResponseEntity<TechnicianDTO> findById(@PathVariable Long id){
        Technician obj = this.technicianService.findbyId(id);
        return ResponseEntity.ok().body(new TechnicianDTO(obj));
    }

    @GetMapping(value = "/cpf/{cpf}") // exemplo http://localhost:8080/technician/cpf/1
    public ResponseEntity<TechnicianDTO> findByCpf(@PathVariable String cpf){
        Technician obj = this.technicianService.findbyCpf(cpf);
        return ResponseEntity.ok().body(new TechnicianDTO(obj));
    }

    @GetMapping(value = "/email/{email}") // exemplo http://localhost:8080/technician/email/1
    public ResponseEntity<TechnicianDTO> findByEmail(@PathVariable String email){
        Technician obj = this.technicianService.findbyEmail(email);
        return ResponseEntity.ok().body(new TechnicianDTO(obj));
    }


    @PostMapping
    public ResponseEntity<TechnicianDTO> create(@Valid @RequestBody TechnicianDTO objDto){

        Technician technician = technicianService.create(objDto);
        // Cria o URI para o recurso criado
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(technician.getId()).toUri();
        // Retorna a resposta com o status 201 Created e o local do recurso criado
        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public ResponseEntity<TechnicianDTO> update(@PathVariable Long id, @Valid @RequestBody TechnicianDTO objDto){
        Technician technician = technicianService.update(id,objDto);
        return ResponseEntity.ok().body(new TechnicianDTO(technician));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<TechnicianDTO> delete(@PathVariable Long id){
        technicianService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
