package com.biblioteca.service;

import com.biblioteca.domains.dtos.EditoraDTO;
import com.biblioteca.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
