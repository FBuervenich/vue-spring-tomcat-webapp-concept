package de.wzl.springboottest.advices;

import javax.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * When an EntityNotFoundException is thrown, this extra tidbit of Spring MVC
 * configuration is used to render an HTTP 404:
 *
 * @author muc_hs
 */
@ControllerAdvice
public class EntitityNotFoundAdvice {

    /**
     * @ResponseBody signals that this advice is rendered straight into the
     * response body.
     * @ExceptionHandler configures the advice to only respond if an
     * EntityNotFoundException is thrown.
     * @ResponseStatus says to issue an HttpStatus.NOT_FOUND, i.e. an HTTP 404.
     * The body of the advice generates the content. In this case, it gives the
     * message of the exception.
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String entityNotFoundHandler(EntityNotFoundException ex) {
        return ex.getMessage();
    }
}
