package de.wzl.springboottest.repositories;

import de.wzl.springboottest.domain.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * This interface extends Spring Data JPA’s JpaRepository, specifying the domain
 * type as Employee and the id type as Long. This interface, though empty on the
 * surface, packs a punch given it supports:
 *
 * - Creating new instances
 *
 * - Updating existing ones
 *
 * - Deleting
 *
 * - Finding (one, all, by simple or complex properties)
 *
 * Spring Data’s repository solution makes it possible to sidestep data store
 * specifics and instead solve a majority of problems using domain-specific
 * terminology.
 *
 * @author muc_hs
 */
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
