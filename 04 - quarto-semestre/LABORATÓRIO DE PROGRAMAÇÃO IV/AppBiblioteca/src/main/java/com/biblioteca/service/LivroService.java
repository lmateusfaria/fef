package com.biblioteca.service;

import com.biblioteca.domains.dtos.LivroDTO;
import com.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepo;

    public List<LivroDTO> findAll(){
        //retorna uma lista de GrupoProdutoDRO
        return livroRepo.findAll().stream()
                .map(obj -> new LivroDTO(obj))
                .collect(Collectors.toList());
    }
}
