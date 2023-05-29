package jp.co.project.planets.marsfour.webapp.security.handler;

import java.io.IOException;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class OidcSuccessHandler implements AuthenticationSuccessHandler {

    private final RequestCache requestCache = new HttpSessionRequestCache();
    private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    private static final Logger log = LoggerFactory.getLogger(OidcSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(final HttpServletRequest request, final HttpServletResponse response,
            final Authentication authentication) throws IOException, ServletException {
        final var savedRequest = this.requestCache.getRequest(request, response);
        if (Objects.isNull(savedRequest)) {
            log.debug("empty save request.");
            redirectStrategy.sendRedirect(request, response, "/");
            return;
        }

        final var redirectUrl = savedRequest.getRedirectUrl();
        redirectStrategy.sendRedirect(request, response, redirectUrl);
    }
}
