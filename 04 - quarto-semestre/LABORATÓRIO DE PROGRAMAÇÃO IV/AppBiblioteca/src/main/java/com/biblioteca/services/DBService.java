package com.biblioteca.services;

import com.biblioteca.domains.Autor;
import com.biblioteca.domains.Editora;
import com.biblioteca.domains.Livro;
import com.biblioteca.domains.enums.Conservacao;
import com.biblioteca.domains.enums.Status;
import com.biblioteca.repositories.AutorRepository;
import com.biblioteca.repositories.EditoraRepository;
import com.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private AutorRepository autorRepo;

    @Autowired
    private EditoraRepository editoraRepo;

    @Autowired
    private LivroRepository livroRepo;

    public void initDB(){
        Autor autor01 = new Autor(null,"Maria","01");
        Autor autor02 = new Autor(null,"José","02");

        Editora editora01 = new Editora(null,"0001-01","Editora 01");
        Editora editora02 = new Editora(null,"0002-02","Editora 02");

        Livro livro01 = new Livro(null, "O primeiro Livro", "1111", 25, LocalDate.now(),new BigDecimal("35.9"),autor01,editora01, Status.NAOLIDO, Conservacao.EXCELENTE);
        Livro livro02 = new Livro(null, "O segundo Livro", "2222", 40, LocalDate.now(),new BigDecimal("95.3"),autor02,editora02, Status.LENDO, Conservacao.GASTO);
        Livro livro03 = new Livro(null, "O terceiro Livro", "3333", 70, LocalDate.now(),new BigDecimal("22.5"),autor01,editora02, Status.NAOLIDO, Conservacao.MARCASDEUSO);
        Livro livro04 = new Livro(null, "O quarto Livro", "4444", 130, LocalDate.now(),new BigDecimal("11.9"),autor02,editora01, Status.LIDO, Conservacao.BOM);

        autorRepo.save(autor01);
        autorRepo.save(autor02);

        editoraRepo.save(editora01);
        editoraRepo.save(editora02);

        livroRepo.save(livro01);
        livroRepo.save(livro02);
        livroRepo.save(livro03);
        livroRepo.save(livro04);

    }


}
