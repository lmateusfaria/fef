package com.petSolidario.repositories;

import com.petSolidario.domains.Animal;
import com.petSolidario.domains.Instituicao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Optional<Animal> findByRegistro(String registro);

}
