package com.curso.resources;

import com.curso.domains.ServiceOrder;
import com.curso.domains.dtos.ServiceOrderDTO;
import com.curso.services.ServiceOrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/serviceorder")
public class ServiceOrderResource {

    @Autowired
    private ServiceOrderService osService;

    @GetMapping //exemplo http://localhost:8080/serviceOrder
    public ResponseEntity<List<ServiceOrderDTO>> findAll(){
        return ResponseEntity.ok().body(osService.findAll());
    }

    @GetMapping(value = "/{id}") // exemplo http://localhost:8080/serviceOrder/1
    public ResponseEntity<ServiceOrderDTO> findById(@PathVariable UUID id){
        ServiceOrder obj = this.osService.findbyId(id);
        return ResponseEntity.ok().body(new ServiceOrderDTO(obj));
    }

    @PostMapping
    public ResponseEntity<ServiceOrderDTO> create(@Valid @RequestBody ServiceOrderDTO objDto){

        ServiceOrder serviceOrder = osService.create(objDto);
        // Cria o URI para o recurso criado
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(serviceOrder.getId()).toUri();
        // Retorna a resposta com o status 201 Created e o local do recurso criado
        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public ResponseEntity<ServiceOrderDTO> update(@PathVariable UUID id, @Valid @RequestBody ServiceOrderDTO objDto){
        ServiceOrder serviceOrder = osService.update(id,objDto);
        return ResponseEntity.ok().body(new ServiceOrderDTO(serviceOrder));
    }

}
