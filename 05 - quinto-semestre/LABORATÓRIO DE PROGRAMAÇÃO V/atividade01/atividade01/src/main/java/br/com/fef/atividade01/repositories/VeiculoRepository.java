package br.com.fef.atividade01.repositories;

import br.com.fef.atividade01.domains.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    Optional<Veiculo> findByCpfProprietario(String cpfProprietario);
}
