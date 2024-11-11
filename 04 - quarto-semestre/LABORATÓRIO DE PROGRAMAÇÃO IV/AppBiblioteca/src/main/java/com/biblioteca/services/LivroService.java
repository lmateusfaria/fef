package com.biblioteca.services;

import com.biblioteca.domains.Autor;
import com.biblioteca.domains.Editora;
import com.biblioteca.domains.Livro;
import com.biblioteca.domains.dtos.LivroDTO;
import com.biblioteca.repositories.AutorRepository;
import com.biblioteca.repositories.EditoraRepository;
import com.biblioteca.repositories.LivroRepository;
import com.biblioteca.services.exceptions.DataIntegrityViolationException;
import com.biblioteca.services.exceptions.ObjectNotFoundException;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepo;

    @Autowired
    private AutorRepository autorRepo;

    @Autowired
    private EditoraRepository editoraRepo;


    public List<LivroDTO> findAll(){
        //retorna uma lista de GrupoProdutoDRO
        return livroRepo.findAll().stream()
                .map(obj -> new LivroDTO(obj))
                .collect(Collectors.toList());
    }

    public Livro findbyId(Integer id){
        Optional<Livro> obj = livroRepo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Livro não encontrado! ID: "+id));
    }

    public Livro findbyIsbn(String isbn){
        Optional<Livro> obj = livroRepo.findByIsbn(isbn);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Livro não encontrado! Isbn: "+isbn));
    }

    public Livro create(LivroDTO dto){
        dto.setId(null);
        validaLivro(dto);
        Livro obj = new Livro(dto);
        return livroRepo.save(obj);
    }

    private void validaLivro(LivroDTO dto){
        Optional<Livro> obj = livroRepo.findByIsbn(dto.getIsbn());
        if (obj.isPresent() && obj.get().getIdLivro() != dto.getId()){
            throw new DataIntegrityViolationException("ISBN já Cadastrado!");
        }

        Optional<Autor> autor = autorRepo.findById(dto.getAutor());
        if(!autor.isPresent()){
            throw new DataIntegrityViolationException("Autor - "+ dto.getAutor() + " Não está cadastrado!");
        }

        Optional<Editora> editora = editoraRepo.findById(dto.getEditora());
        if(!editora.isPresent()){
            throw new DataIntegrityViolationException("Editora - "+ dto.getEditora() + " Não está cadastrada!");
        }
    }

    public Livro update(Integer id, LivroDTO objDto){
        objDto.setId(id);
        Livro oldObj = findbyId(id);
        validaLivro(objDto);
        oldObj = new Livro(objDto);
        return livroRepo.save(oldObj);
    }

    public void delete(Integer id){
        Livro obj = findbyId(id);
        editoraRepo.deleteById(id);
    }
}