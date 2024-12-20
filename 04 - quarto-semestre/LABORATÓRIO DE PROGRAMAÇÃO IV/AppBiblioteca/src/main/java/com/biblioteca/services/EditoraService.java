package com.biblioteca.services;

import com.biblioteca.domains.Editora;
import com.biblioteca.domains.dtos.EditoraDTO;
import com.biblioteca.repositories.EditoraRepository;
import com.biblioteca.services.exceptions.DataIntegrityViolationException;
import com.biblioteca.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepo;

    public List<EditoraDTO> findAll(){
        //retorna uma lista de GrupoProdutoDRO
        return editoraRepo.findAll().stream()
                .map(obj -> new EditoraDTO(obj))
                .collect(Collectors.toList());
    }

    public Editora findbyId(Integer id){
        Optional<Editora> obj = editoraRepo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Editora não encontrada! ID: "+ id));
    }

    public Editora findbyCnpj(String cnpj){
        Optional<Editora> obj = editoraRepo.findByCnpj(cnpj);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Editora não encontrada! Cnpj: "+cnpj));
    }

    public Editora create(EditoraDTO dto){
        dto.setId(null);
        validaEditora(dto);
        Editora obj = new Editora(dto);
        return editoraRepo.save(obj);
    }

    private void validaEditora(EditoraDTO dto){
        Optional<Editora> obj = editoraRepo.findByCnpj(dto.getCnpj());
        if (obj.isPresent() && obj.get().getId() != dto.getId()){
            throw new DataIntegrityViolationException("Cpnj já Cadastrado!");
        }
    }

    public Editora update(Integer id, EditoraDTO objDto){
        objDto.setId(id);
        Editora oldObj = findbyId(id);
        validaEditora(objDto);
        oldObj = new Editora(objDto);
        return  editoraRepo.save(oldObj);
    }

    public void delete (Integer id){
        Editora obj = findbyId(id);
        if(obj.getLivros().size()>0){
            throw new DataIntegrityViolationException("Editora não pode ser deletada pois possui livros vinculados!");
        }
    }



}
