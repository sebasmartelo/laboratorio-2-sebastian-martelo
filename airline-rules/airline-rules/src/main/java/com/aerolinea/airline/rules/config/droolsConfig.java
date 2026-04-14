package com.aerolinea.airline.rules.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class droolsConfig {

    @Bean
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();

        KieFileSystem kfs = kieServices.newKieFileSystem();
        kfs.write(
                "src/main/resources/rules/airline-rules.drl",
                kieServices.getResources()
                        .newClassPathResource("rules/airline-rules.drl")
        );

        KieBuilder kieBuilder = kieServices.newKieBuilder(kfs);
        kieBuilder.buildAll();

        Results results = kieBuilder.getResults();

        if (results.hasMessages(Message.Level.ERROR)) {
            throw new RuntimeException(
                    "Error en las reglas DRL: " + results.getMessages()
            );
        }

        return kieServices.newKieContainer(
                kieServices.getRepository().getDefaultReleaseId()
        );
    }
}