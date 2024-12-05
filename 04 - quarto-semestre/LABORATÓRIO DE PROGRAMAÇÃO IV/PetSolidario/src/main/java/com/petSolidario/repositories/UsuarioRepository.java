package com.petSolidario.repositories;

import com.petSolidario.domains.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Optional<Usuario>findByCpf(String cpf);
    Optional<Usuario>findByEmail(String email);

}
