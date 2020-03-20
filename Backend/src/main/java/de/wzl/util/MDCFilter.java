package de.wzl.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.keycloak.KeycloakPrincipal;
import org.slf4j.MDC;

/**
 * provides functionality for additional logging output e.g. username of current
 * user
 */
public class MDCFilter implements Filter {

    /**
     * gets the username and userid of the current user and adds it to log
     * output
     *
     * @param sr request of the servlet
     * @param sr1 response of the servlet
     * @param fc filter chain to apply
     * @throws IOException thrown if TODO
     * @throws ServletException thrown if TODO
     */
    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc)
            throws IOException, ServletException {
        var request = (HttpServletRequest) sr;
        var principal = (KeycloakPrincipal) request.getUserPrincipal();
        var token = principal.getKeycloakSecurityContext().getToken();
        var userName = "userName";
        var userId = "userId";
        if (token != null) {
            MDC.put(userName, token.getPreferredUsername());
            MDC.put(userId, token.getSubject());
        } else {
            MDC.put(userName, "no user");
        }
        try {
            fc.doFilter(sr, sr1);
        } finally {
            if (token != null) {
                MDC.remove(userName);
                MDC.remove(userId);
            }
        }
    }
}
