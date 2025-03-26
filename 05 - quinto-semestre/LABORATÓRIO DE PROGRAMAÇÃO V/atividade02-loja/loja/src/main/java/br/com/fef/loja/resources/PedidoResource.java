package br.com.fef.loja.resources;

import br.com.fef.loja.domains.Cliente;
import br.com.fef.loja.domains.Pedido;
import br.com.fef.loja.domains.dtos.ClienteDTO;
import br.com.fef.loja.domains.dtos.PedidoDTO;
import br.com.fef.loja.services.ClienteService;
import br.com.fef.loja.services.PedidoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<PedidoDTO>> findAll() {
        return ResponseEntity.ok().body(pedidoService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PedidoDTO> findById(@PathVariable Long id) {
        Pedido obj = this.pedidoService.findbyId(id);
        return ResponseEntity.ok().body(new PedidoDTO(obj));
    }

    @PostMapping
    public ResponseEntity<PedidoDTO> create(@Valid @RequestBody PedidoDTO objDto) {
        Pedido pedido = this.pedidoService.create(objDto);
        //CRIA O URI PARA O RECURSO CRIADO
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(pedido.getId()).toUri();
        //RETORNA A RESPOSTA COM O STATUS 201 CREATED E O LOCAL DO RECURSO CRIADO
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PedidoDTO> update(@PathVariable Long id, @Valid @RequestBody PedidoDTO objDto) {
        Pedido pedido = this.pedidoService.update(id, objDto);
        return ResponseEntity.ok().body(new PedidoDTO(pedido));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PedidoDTO> delete(@PathVariable Long id) {
        this.pedidoService.delete(id);
        return ResponseEntity.noContent().build();
    }




}
