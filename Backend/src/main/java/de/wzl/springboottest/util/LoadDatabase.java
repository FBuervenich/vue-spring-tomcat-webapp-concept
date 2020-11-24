/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wzl.springboottest.util;

import de.wzl.springboottest.domain.Greeting;
import de.wzl.springboottest.repositories.GreetingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Boot will run ALL CommandLineRunner beans once the application context
 * is loaded.
 *
 * This runner will request a copy of the EmployeeRepository you just created.
 *
 * Using it, it will create two entities and store them.
 *
 * @Slf4j is a Lombok annotation to autocreate an Slf4j-based LoggerFactory as
 * log, allowing us to log these newly created "greetings".
 *
 * @author muc_hs
 */
@Slf4j
@Configuration
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(GreetingRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Greeting("Hello, Jan")));
            log.info("Preloading " + repository.save(new Greeting("Hello, Florentin")));
        };
    }
}
