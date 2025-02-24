package br.com.fef.atividade01.services;

import br.com.fef.atividade01.domains.Veiculo;
import br.com.fef.atividade01.domains.enums.Status;
import br.com.fef.atividade01.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public void initDB() {
        Veiculo veiculo01 = new Veiculo(null, "Fiat - Uno", LocalDate.now(), new BigDecimal("20000.00"), "João", "12345678901", Status.ALUGADO);
        Veiculo veiculo02 = new Veiculo(null, "Ford - Fiesta", LocalDate.now(), new BigDecimal("30000.00"), "Maria", "12345678902", Status.EM_MANUTENCAO);
        Veiculo veiculo03 = new Veiculo(null, "Chevrolet - Onix", LocalDate.now(), new BigDecimal("40000.00"), "José", "12345678903", Status.DISPONIVEL);

        veiculoRepository.save(veiculo01);
        veiculoRepository.save(veiculo02);
        veiculoRepository.save(veiculo03);

    }
}
