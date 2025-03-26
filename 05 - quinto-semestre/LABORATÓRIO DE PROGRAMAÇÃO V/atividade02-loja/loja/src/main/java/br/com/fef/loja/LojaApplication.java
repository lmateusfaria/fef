package br.com.fef.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"br.com.fef.loja"})
@EntityScan(basePackages = {"br.com.fef.loja.domains", "br.com.fef.loja.domains.enums"})
@EnableJpaRepositories(basePackages = {"br.com.fef.loja.repositories"})
@SpringBootApplication
public class LojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}

}
