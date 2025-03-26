package br.com.fef.atividade01.config;

import br.com.fef.atividade01.services.DBService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;

    @Scheduled(fixedDelay = 1000*60)
    @PostConstruct
    public void init() {
        dbService.initDB();
    }

}
