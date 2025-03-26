package br.com.fef.loja.services;

import br.com.fef.loja.domains.Cliente;
import br.com.fef.loja.domains.dtos.ClienteDTO;
import br.com.fef.loja.repositories.ClienteRepository;
import br.com.fef.loja.services.exceptions.DataIntegrityViolationException;
import br.com.fef.loja.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepo;

    public List<ClienteDTO> findAll() {
        return clienteRepo.findAll().stream()
                .map(obj -> new ClienteDTO(obj))
                .collect(Collectors.toList());
    }

    public Cliente findbyId(Long id){
        Optional<Cliente> obj = clienteRepo.findById(id);
        return obj.orElseThrow(
                () -> new ObjectNotFoundException("Cliente não encontrado! Id: " + id + "\nTipo: " + Cliente.class.getName()));
    }

    public Cliente findbyEmail(String email){
        Optional<Cliente> obj = clienteRepo.findByEmail(email);
        return obj.orElseThrow(
                () -> new ObjectNotFoundException("Cliente não encontrado! email do cliente: " + email + "\nTipo: " + Cliente.class.getName()));

    }

    public Cliente create(ClienteDTO dto){
        dto.setId(null);
        validaCliente(dto);
        Cliente obj = new Cliente(dto);
        return clienteRepo.save(obj);
    }

    public Cliente update(Long id,ClienteDTO objDto){
        objDto.setId(id);
        Cliente oldObj = findbyId(id);
        validaCliente(objDto);
        oldObj = new Cliente(objDto);
        return clienteRepo.save(oldObj);
    }

    public void delete(Long id){
        Cliente obj = findbyId(id);
        if (obj.getPedidos().size() > 0) {
            throw new DataIntegrityViolationException("Cliente não pode ser deletado, pois está associado a um pedido!");
        }
        clienteRepo.deleteById(id);
    }

    public void validaCliente(ClienteDTO dto){
        Optional<Cliente> obj = clienteRepo.findByEmail(dto.getNome());
        if(obj.isPresent() && obj.get().getNome() != dto.getNome()){
            throw new DataIntegrityViolationException("Cliente já cadastrado: " + dto.getNome());
        }
    }

}
