package br.com.fef.pokemon.Pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//@ComponentScan(basePackages = "com.curso")
//@EntityScan(basePackages = {"com.curso.domains","com.curso.domains.enums"})
//@EnableJpaRepositories(basePackages = "com.curso.repositories")
@ComponentScan(basePackages = "br.com.fef.pokemon")
@EntityScan(basePackages = {"br.com.fef.pokemon.domains","com.curso.domains.enums"})
@EnableJpaRepositories(basePackages = "br.com.fef.pokemon.repositories")
@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
	}

}
