package com.petSolidario.repositories;

import com.petSolidario.domains.Produto;
import com.petSolidario.domains.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Optional<Produto> findByCodigoDeBarras(String codigoDeBarras);
}
