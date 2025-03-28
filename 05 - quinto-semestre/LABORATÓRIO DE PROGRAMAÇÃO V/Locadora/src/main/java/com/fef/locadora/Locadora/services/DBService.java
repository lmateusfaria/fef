package com.fef.locadora.Locadora.services;


import com.fef.locadora.Locadora.domains.Veiculo;
import com.fef.locadora.Locadora.domains.enums.SituacaoVeiculo;
import com.fef.locadora.Locadora.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public void initDB() {
        Veiculo veiculo1 = new Veiculo(null, "Ferrari Vermelha", LocalDate.now(), new BigDecimal("100000.00"), "Seu zé", "123.456.789-09", SituacaoVeiculo.DISPONIVEL);
        Veiculo veiculo2 = new Veiculo(null, "BMW X6", LocalDate.now(), new BigDecimal("100000.00"), "Dona Maria", "987.654.321-00", SituacaoVeiculo.DISPONIVEL);
        Veiculo veiculo3 = new Veiculo(null, "Audi A4", LocalDate.now(), new BigDecimal("80000.00"), "João Silva", "111.222.333-44", SituacaoVeiculo.DISPONIVEL);
        Veiculo veiculo4 = new Veiculo(null, "Mercedes C200", LocalDate.now(), new BigDecimal("120000.00"), "Ana Souza", "555.666.777-88", SituacaoVeiculo.DISPONIVEL);
        Veiculo veiculo5 = new Veiculo(null, "Toyota Corolla", LocalDate.now(), new BigDecimal("70000.00"), "Carlos Pereira", "999.888.777-66", SituacaoVeiculo.DISPONIVEL);

        veiculoRepository.save(veiculo1);
        veiculoRepository.save(veiculo2);
        veiculoRepository.save(veiculo3);
        veiculoRepository.save(veiculo4);
        veiculoRepository.save(veiculo5);

    }
}



