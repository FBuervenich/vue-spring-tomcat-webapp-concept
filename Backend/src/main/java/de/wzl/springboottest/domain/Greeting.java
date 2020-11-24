package de.wzl.springboottest.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 *
 * @Data is a Lombok annotation to create all the getters, setters, equals,
 * hash, and toString methods, based on the fields.
 *
 * @Entity is a JPA annotation to make this object ready for storage in a
 * JPA-based data store.
 *
 * @author muc_hs
 */
@Data
@Entity
@Table(name = "springboottest_greeting")
public class Greeting implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    public Greeting() {
    }

    /**
     * a custom constructor is created when we need to create a new instance,
     * but don’t yet have an id.
     *
     * @param content
     */
    public Greeting(String content) {
        this.content = content;
    }

}
