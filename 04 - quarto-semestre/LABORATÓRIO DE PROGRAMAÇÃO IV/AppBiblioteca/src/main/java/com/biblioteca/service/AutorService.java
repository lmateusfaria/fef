package com.biblioteca.service;

import com.biblioteca.domains.dtos.AutorDTO;
import com.biblioteca.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
