package com.petSolidario.repositories;

import com.petSolidario.domains.Produto;
import com.petSolidario.domains.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Optional<Produto> findByCodigoDeBarras(String codigoDeBarras);
}
