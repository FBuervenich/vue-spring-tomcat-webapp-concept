package de.wzl.springboottest.restcontroller;

import de.wzl.springboottest.domain.Greeting;
import de.wzl.springboottest.exceptions.GreetingNotFoundException;
import de.wzl.springboottest.repositories.GreetingRepository;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController indicates that the data returned by each method will be
 * written straight into the response body instead of rendering a template.
 *
 *
 * created using: https://spring.io/guides/tutorials/rest/
 * @author muc_hs
 */
@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!";

    private final GreetingRepository repository;

    /**
     * An GreetingRepository is injected by constructor into the controller.
     *
     * @param repository
     */
    public GreetingController(GreetingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/greetings")
    List<Greeting> all() {
        return repository.findAll();
    }

    @PostMapping("/greetings")
    Greeting newGreeting(@RequestBody Greeting newGreeting) {
        newGreeting.setContent(String.format(TEMPLATE, newGreeting.getContent()));
        return repository.save(newGreeting);
    }

    // Single item
    @GetMapping("/greetings/{id}")
    Greeting one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new GreetingNotFoundException(id));
    }

    @PutMapping("/greetings/{id}")
    Greeting replaceGreeting(@RequestBody Greeting newGreeting, @PathVariable Long id) {

        return repository.findById(id)
                .map(greeting -> {
                    greeting.setContent(String.format(TEMPLATE, newGreeting.getContent()));
                    return repository.save(greeting);
                })
                .orElseGet(() -> {
                    newGreeting.setId(id);
                    return repository.save(newGreeting);
                });
    }

    @DeleteMapping("/greetings/{id}")
    void deleteGreeting(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
