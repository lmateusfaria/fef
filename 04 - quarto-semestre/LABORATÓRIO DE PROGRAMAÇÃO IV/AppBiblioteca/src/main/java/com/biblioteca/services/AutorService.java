package com.biblioteca.services;

import com.biblioteca.domains.Autor;
import com.biblioteca.domains.dtos.AutorDTO;
import com.biblioteca.repositories.AutorRepository;
import com.biblioteca.services.exceptions.DataIntegrityViolationException;
import com.biblioteca.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepo;

    public List<AutorDTO> findAll(){
        //retorna uma lista de GrupoProdutoDRO
        return autorRepo.findAll().stream()
                .map(obj -> new AutorDTO(obj))
                .collect(Collectors.toList());
    }

    public Autor findbyId(Long id){
        Optional<Autor> obj = autorRepo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Autor não encontrado! ID: "+ id));
    }

    public Autor findbyDocumentoPessoal(String documentoPessoal){
        Optional<Autor> obj = autorRepo.findByDocumentoPessoal(documentoPessoal);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Autor não encontrado! Documento Pessoal: "+documentoPessoal));
    }

    public Autor create(AutorDTO dto){
        dto.setId(null);
        validaAutor(dto);
        Autor obj = new Autor(dto);
        return autorRepo.save(obj);
    }

    private void validaAutor(AutorDTO dto){
        Optional<Autor> obj = autorRepo.findByDocumentoPessoal(dto.getDocumentoPessoal());
        if(obj.isPresent() && obj.get().getId() != dto.getId()){
            throw new DataIntegrityViolationException("Documento Pessoal já Cadastrado!");
        }
    }

    public Autor update(Long id, AutorDTO objDto){
        objDto.setId(id);
        Autor oldObj = findbyId(id);
        validaAutor(objDto);
        oldObj = new Autor(objDto);
        return autorRepo.save(oldObj);
    }

    public void delete (Long id){
        Autor obj = findbyId(id);
        if (obj.getLivros().size()>0){
            throw new DataIntegrityViolationException("Autor não pode ser deletado pois possui livros vinculados!");
        }
    }

}

