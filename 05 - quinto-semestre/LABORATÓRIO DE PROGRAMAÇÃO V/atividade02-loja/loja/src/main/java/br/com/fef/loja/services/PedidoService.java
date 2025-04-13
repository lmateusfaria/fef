package br.com.fef.loja.services;

import br.com.fef.loja.domains.Cliente;
import br.com.fef.loja.domains.Pedido;
import br.com.fef.loja.domains.dtos.ClienteDTO;
import br.com.fef.loja.domains.dtos.PedidoDTO;
import br.com.fef.loja.repositories.PedidoRepository;
import br.com.fef.loja.services.exceptions.DataIntegrityViolationException;
import br.com.fef.loja.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepo;

    public List<PedidoDTO> findAll() {
        return pedidoRepo.findAll().stream()
                .map(obj -> new PedidoDTO(obj))
                .collect(Collectors.toList());
    }

    public Pedido findbyId(Long id) {
        Optional<Pedido> obj = pedidoRepo.findById(id);
        return obj.orElseThrow(
                () -> new ObjectNotFoundException("Pedido não encontrado! Id: " + id + "\nTipo: " + Pedido.class.getName()));
    }


    public Pedido create(PedidoDTO dto) {
        dto.setId(null);
        validaPedido(dto);
        Pedido obj = new Pedido(dto);
        return pedidoRepo.save(obj);
    }

    public Pedido update(Long id, PedidoDTO objDto) {
        objDto.setId(id);
        Pedido oldObj = findbyId(id);
        validaPedido(objDto);
        oldObj = new Pedido(objDto);
        return pedidoRepo.save(oldObj);
    }

    public void delete(Long id) {
        Pedido obj = findbyId(id);
        pedidoRepo.deleteById(id);
    }

    public void validaPedido(PedidoDTO dto) {
        Optional<Pedido> obj = pedidoRepo.findById(dto.getId());
        if (obj.isPresent() && Objects.equals(obj.get().getId(), dto.getId())) {
            throw new DataIntegrityViolationException("Pedido já cadastrado: " + dto.getId());
        }
    }
}
