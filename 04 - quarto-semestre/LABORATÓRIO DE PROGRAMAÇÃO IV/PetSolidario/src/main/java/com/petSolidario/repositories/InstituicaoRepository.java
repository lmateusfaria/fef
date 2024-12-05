package com.petSolidario.repositories;

import com.petSolidario.domains.Instituicao;
import com.petSolidario.domains.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {
    Optional<Instituicao> findByCnpj(String cnpj);

}
