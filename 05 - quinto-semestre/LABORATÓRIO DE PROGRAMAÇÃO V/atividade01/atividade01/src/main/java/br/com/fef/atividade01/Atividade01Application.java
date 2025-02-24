package br.com.fef.atividade01;

import jakarta.persistence.Enumerated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"br.com.fef.atividade01"})
@EntityScan(basePackages = {"br.com.fef.atividade01.domains", "br.com.fef.atividade01.domains.enums"})
@EnableJpaRepositories(basePackages = {"br.com.fef.atividade01.repositories"})
@SpringBootApplication
public class Atividade01Application {

	public static void main(String[] args) {
		SpringApplication.run(Atividade01Application.class, args);
	}

}
