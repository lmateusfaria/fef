package com.biblioteca.services;

import com.biblioteca.domains.Autor;
import com.biblioteca.domains.dtos.AutorDTO;
import com.biblioteca.repositories.AutorRepository;
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

}
