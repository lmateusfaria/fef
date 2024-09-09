package com.biblioteca.resources;


import com.biblioteca.domains.dtos.EditoraDTO;
import com.biblioteca.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/editora")
public class EditoraResource {

    @Autowired
    private EditoraService editoraService;

    @GetMapping
    public ResponseEntity<List<EditoraDTO>> findAll(){
        return  ResponseEntity.ok().body(editoraService.findAll());
    }
}
