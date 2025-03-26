package br.com.fef.atividade01.resources;

import br.com.fef.atividade01.domains.Veiculo;
import br.com.fef.atividade01.domains.dtos.VeiculoDTO;
import br.com.fef.atividade01.services.VeiculoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoResource {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public ResponseEntity<List<VeiculoDTO>> findAll() {
        return ResponseEntity.ok().body(veiculoService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<VeiculoDTO> findById(@PathVariable Long id) {
        Veiculo obj = this.veiculoService.findbyId(id);
        return ResponseEntity.ok().body(new VeiculoDTO(obj));
    }

    @GetMapping(value = "/cpf/{cpf}")
    public ResponseEntity<VeiculoDTO> findByCpf(@PathVariable String cpf) {
        Veiculo obj = this.veiculoService.findbyCpfProprietario(cpf);
        return ResponseEntity.ok().body(new VeiculoDTO(obj));
    }

    @PostMapping
    public ResponseEntity<VeiculoDTO> create(@Valid @RequestBody VeiculoDTO objDto) {
        Veiculo veiculo = this.veiculoService.create(objDto);
        //CRIA O URI PARA O RECURSO CRIADO
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(veiculo.getId()).toUri();
        //RETORNA A RESPOSTA COM O STATUS 201 CREATED E O LOCAL DO RECURSO CRIADO
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<VeiculoDTO> update(@PathVariable Long id, @Valid @RequestBody VeiculoDTO objDto) {
        Veiculo veiculo = this.veiculoService.update(id, objDto);
        return ResponseEntity.ok().body(new VeiculoDTO(veiculo));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<VeiculoDTO> delete(@PathVariable Long id) {
        this.veiculoService.delete(id);
        return ResponseEntity.noContent().build();
    }




}
