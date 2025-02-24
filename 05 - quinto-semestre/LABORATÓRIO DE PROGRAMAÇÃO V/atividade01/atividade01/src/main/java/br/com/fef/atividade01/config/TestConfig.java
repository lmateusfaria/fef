package br.com.fef.atividade01.config;

import br.com.fef.atividade01.services.DBService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbService;

    @PostConstruct
    public void init() {
        dbService.initDB();
    }

}
