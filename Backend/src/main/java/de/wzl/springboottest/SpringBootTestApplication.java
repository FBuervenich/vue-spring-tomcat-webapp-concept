package de.wzl.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @SpringBootApplication is a meta-annotation that pulls in component scanning,
 * autoconfiguration, and property support. We won’t dive into the details of
 * Spring Boot in this tutorial, but in essence, it will fire up a servlet
 * container and serve up our service.
 * @author muc_hs
 */
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);
    }


}
