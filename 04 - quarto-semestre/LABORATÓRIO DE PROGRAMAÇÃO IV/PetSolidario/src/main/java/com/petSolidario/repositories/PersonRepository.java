package com.petSolidario.repositories;

import com.petSolidario.domains.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByEmail(String username);
    Optional<Person> findByCpf(String cpf);
}