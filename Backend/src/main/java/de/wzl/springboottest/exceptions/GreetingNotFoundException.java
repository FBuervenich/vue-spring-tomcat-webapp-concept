package de.wzl.springboottest.exceptions;

/**
 *
 * @author muc_hs
 */
public class GreetingNotFoundException extends EntityNotFoundException {

    public GreetingNotFoundException(Long id) {
        super(id);
    }
}
