package br.com.fef.atividade01.services;

import br.com.fef.atividade01.domains.Veiculo;
import br.com.fef.atividade01.domains.dtos.VeiculoDTO;
import br.com.fef.atividade01.repositories.VeiculoRepository;
import br.com.fef.atividade01.services.exceptions.DataIntegrityViolationException;
import br.com.fef.atividade01.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepo;

    public List<VeiculoDTO> findAll() {
        return veiculoRepo.findAll().stream()
                .map(obj -> new VeiculoDTO(obj))
                .collect(Collectors.toList());
    }

    public Veiculo findbyId(Long id){
        Optional<Veiculo> obj = veiculoRepo.findById(id);
        return obj.orElseThrow(
                () -> new ObjectNotFoundException("Veiculo não encontrado! Id: " + id + "\nTipo: " + Veiculo.class.getName()));
    }

    public Veiculo findbyCpfProprietario(String cpfProprietario){
        Optional<Veiculo> obj = veiculoRepo.findByCpfProprietario(cpfProprietario);
        return obj.orElseThrow(
                () -> new ObjectNotFoundException("Veiculo não encontrado! Cpf do proprietario: " + cpfProprietario + "\nTipo: " + Veiculo.class.getName()));

    }

    public Veiculo create(VeiculoDTO dto){
        dto.setId(null);
        validaVeiculo(dto);
        Veiculo obj = new Veiculo(dto);
        return veiculoRepo.save(obj);
    }

    public Veiculo update(Long id,VeiculoDTO objDto){
        objDto.setId(id);
        Veiculo oldObj = findbyId(id);
        validaVeiculo(objDto);
        oldObj = new Veiculo(objDto);
        return veiculoRepo.save(oldObj);
    }

    public void delete(Long id){
        Veiculo obj = findbyId(id);
        if (obj.getStatus().equals("ALUGADO")) {
            throw new DataIntegrityViolationException("Veiculo não pode ser deletado, pois está alugado!");
        }
        veiculoRepo.deleteById(id);
    }

    public void validaVeiculo(VeiculoDTO dto){
        Optional<Veiculo> obj = veiculoRepo.findByCpfProprietario(dto.getCpfProprietario());
        if(obj.isPresent() && obj.get().getCpfProprietario() != dto.getCpfProprietario()){
            throw new DataIntegrityViolationException("Cpf já cadastrado: " + dto.getCpfProprietario());
        }
    }

}
