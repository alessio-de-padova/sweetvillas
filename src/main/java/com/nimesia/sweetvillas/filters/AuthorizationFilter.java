package com.nimesia.sweetvillas.filters;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.nimesia.sweetvillas.providers.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

/**
 * The type Authorization filter.
 */
public class AuthorizationFilter extends BasicAuthenticationFilter {

    /**
     * Instantiates a new Authorization filter.
     *
     * @param authenticationManager the authentication manager
     */
    @Autowired
    public AuthorizationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        String token = null;

        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("token")) {
                    token = cookie.getValue();
                }
            }
        }

        if (token != null) {
            DecodedJWT decoded = JwtProvider.verifyJwt(token);
            SecurityContextHolder
                    .getContext()
                    .setAuthentication(
                            new UsernamePasswordAuthenticationToken(decoded.getSubject(), null, Collections.emptyList())
                    );
            request.setAttribute("decoded", decoded);
        }

        chain.doFilter(request, response);
    }
}