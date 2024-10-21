package com.curso.services;

import com.curso.domains.Medico;
import com.curso.domains.Paciente;
import com.curso.repositories.MedicoRepository;
import com.curso.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {
    @Autowired
    private PacienteRepository pacienteRepo;

    @Autowired
    private MedicoRepository medicoRepo;

    public void initDB(){

        Paciente paciente01 = new Paciente(0, "Luis Mateus", LocalDate.now(), new BigDecimal("7000.00"));
        Paciente paciente02 = new Paciente(0, "Esther Faria", LocalDate.now(), new BigDecimal("50000.00"));

        Medico medico01 = new Medico (0,"Drª. Esther Faria", LocalDate.now(), new BigDecimal("50000.00"));
        Medico medico02 = new Medico(0, "Drª. Fafa ", LocalDate.now(), new BigDecimal("35000.00"));
        pacienteRepo.save(paciente01);
        pacienteRepo.save(paciente02);
        medicoRepo.save(medico01);
        medicoRepo.save(medico02);
    }

}