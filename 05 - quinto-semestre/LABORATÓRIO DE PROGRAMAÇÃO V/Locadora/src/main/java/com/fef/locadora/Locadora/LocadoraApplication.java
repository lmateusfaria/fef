package com.fef.locadora.Locadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.fef.locadora.Locadora")
@EntityScan(basePackages = {"com.fef.locadora.Locadora.domains", "com.fef.locadora.Locadora.domains.enums"})
@EnableJpaRepositories(basePackages = "com.fef.locadora.Locadora.repositories")
@SpringBootApplication
public class LocadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocadoraApplication.class, args);
	}

}
