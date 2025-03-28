package com.fef.locadora.Locadora.services;

import com.fef.locadora.Locadora.domains.Veiculo;
import com.fef.locadora.Locadora.domains.dtos.VeiculoDTO;
import com.fef.locadora.Locadora.domains.enums.SituacaoVeiculo;
import com.fef.locadora.Locadora.repositories.VeiculoRepository;
import com.fef.locadora.Locadora.services.exceptions.DataIntegrityViolationException;
import com.fef.locadora.Locadora.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepo;

    // Retorna uma lista de VeiculoDTO
    public List<VeiculoDTO> findAll() {
        return veiculoRepo.findAll().stream()
                .map(obj -> new VeiculoDTO(obj))
                .collect(Collectors.toList());
    }

    public Veiculo findById(Long id) {
        Optional<Veiculo> obj = veiculoRepo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Usuário Não Encontrado! ID: " + id));
    }

    public Veiculo findByCpf(String cpf) {
        Optional<Veiculo> obj = veiculoRepo.findByCpf(cpf);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Usuário Não Encontrado! CPF: " + cpf));
    }

    public Veiculo create(VeiculoDTO dto) {
        dto.setId(null);
        validaveiculo(dto);
        Veiculo obj = new Veiculo(dto);

        return veiculoRepo.save(obj);
    }

    public Veiculo update(Long id, VeiculoDTO dto) {
        dto.setId(id);
        Veiculo oldObj = findById(id);
        validaveiculo(dto);
        oldObj = new Veiculo(dto);
        return veiculoRepo.save(oldObj);
    }

    public void delete(Long id) {
        Veiculo obj = findById(id);

        // Verifica se o veiculo está alugado
        if (!obj.getSituacao().equals(SituacaoVeiculo.DISPONIVEL)) {
            throw new DataIntegrityViolationException("Veiculo não pode ser excluído! Ele está Alugado!");
        }

        // SE NÃO ESTIVER ALUGADO
        veiculoRepo.deleteById(id);
    }


    // Valida se o CPF já está cadastrado
    private void validaveiculo(VeiculoDTO dto) {

        Optional<Veiculo> objId = veiculoRepo.findById(dto.getId());
        if (objId.isPresent() && !objId.get().getId().equals(dto.getId())) {
            throw new DataIntegrityViolationException("ID já Cadastrado!");
        }

        Optional<Veiculo> objCpf = veiculoRepo.findByCpf(dto.getCpf());
        if (objCpf.isPresent() && !objCpf.get().getId().equals(dto.getId())) {
            throw new DataIntegrityViolationException("CPF já Cadastrado!");
        }

    }

}
