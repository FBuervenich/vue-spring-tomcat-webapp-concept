package de.wzl.springboottest.exceptions;

/**
 * Will be thrown when entity with given identifier does not exist
 *
 * @author muc_hs
 */
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Object identifier) {
        super("Entity with identifier \"" + String.valueOf(identifier) + "\" not found.");
    }

}
