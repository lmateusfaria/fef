package com.petSolidario.services;

import com.petSolidario.domains.Animal;
import com.petSolidario.domains.Instituicao;
import com.petSolidario.domains.Produto;
import com.petSolidario.domains.Usuario;
import com.petSolidario.domains.enums.Porte;
import com.petSolidario.domains.enums.Situacao;
import com.petSolidario.repositories.AnimalRepository;
import com.petSolidario.repositories.InstituicaoRepository;
import com.petSolidario.repositories.ProdutoRepository;
import com.petSolidario.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class DBService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private InstituicaoRepository instituicaoRepo;

    @Autowired
    private AnimalRepository animalRepo;

    @Autowired
    private ProdutoRepository produtoRepo;

    public void initDB(){
        Usuario usuario1 = new Usuario(null, LocalDate.now(),"usuario1@gmail.com","senhauser1","usuario1","Masculino","111", LocalDate.of(2000,11,25),null,null,null);
        Usuario usuario2 = new Usuario(null, LocalDate.now(),"usuario2@gmail.com","senhauser2","usuario2","Feminino","333", LocalDate.of(2004,5,1),null,null,null);

        usuarioRepo.save(usuario1);
        usuarioRepo.save(usuario2);

        Instituicao instituicao1 = new Instituicao(null, LocalDate.now(),"Instiuição 01", "111-111","01-Instiuição",null,usuario1,null, Situacao.APROVADO);
        Instituicao instituicao2 = new Instituicao(null, LocalDate.now(),"Instiuição 02", "222-222","02-Instiuição",null,usuario2,null, Situacao.APROVADO);

        instituicaoRepo.save(instituicao1);
        instituicaoRepo.save(instituicao2);

        Animal animal1 = new Animal(null,LocalDate.now(),"A1","Sem Nome","Cachorro","Cão de Rua", "Preto","Macho",null,instituicao1,usuario1, Porte.MEDIO);
        Animal animal2 = new Animal(null,LocalDate.now(),"A2","Sem Nome","Gato","Gato de Siamez", "Branco","Femea",null,instituicao2,usuario2, Porte.PEQUENO);

        animalRepo.save(animal1);
        animalRepo.save(animal2);

        Produto produto1 = new Produto(null,LocalDate.now(),"Ração para Gato 10Kg", new BigDecimal("10.1"),"CB001",instituicao1,usuario1);
        Produto produto2 = new Produto(null,LocalDate.now(),"Ração para Dogs 5Kg", new BigDecimal("5.1"),"CB002",instituicao2,usuario2);

        produtoRepo.save(produto1);
        produtoRepo.save(produto2);
    }
}

