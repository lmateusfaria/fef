package br.com.fef.loja.resources;

import br.com.fef.loja.domains.Cliente;
import br.com.fef.loja.domains.dtos.ClienteDTO;
import br.com.fef.loja.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> findAll() {
        return ResponseEntity.ok().body(clienteService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClienteDTO> findById(@PathVariable Long id) {
        Cliente obj = this.clienteService.findbyId(id);
        return ResponseEntity.ok().body(new ClienteDTO(obj));
    }

    @GetMapping(value = "/cpf/{cpf}")
    public ResponseEntity<ClienteDTO> findByCliente(@PathVariable String cliente) {
        Cliente obj = this.clienteService.findbyEmail(cliente);
        return ResponseEntity.ok().body(new ClienteDTO(obj));
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> create(@Valid @RequestBody ClienteDTO objDto) {
        Cliente cliente = this.clienteService.create(objDto);
        //CRIA O URI PARA O RECURSO CRIADO
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(cliente.getId()).toUri();
        //RETORNA A RESPOSTA COM O STATUS 201 CREATED E O LOCAL DO RECURSO CRIADO
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ClienteDTO> update(@PathVariable Long id, @Valid @RequestBody ClienteDTO objDto) {
        Cliente cliente = this.clienteService.update(id, objDto);
        return ResponseEntity.ok().body(new ClienteDTO(cliente));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ClienteDTO> delete(@PathVariable Long id) {
        this.clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }




}
