package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.mappers.AccountMapper;
import com.nimesia.sweetvillas.providers.JwtProvider;
import com.nimesia.sweetvillas.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Used only as test.
 */
@RestController
class JWTController {

    @Autowired
    private AccountService svc;
    @Autowired
    private AccountMapper mapper;

    /**
     * Creates a resource token. Tries to mimic the final result of a login service
     *
     */
    @PostMapping("/public/jwt-test/create-token")
    public ResponseEntity createJwt(
    ) {

        String jwt = JwtProvider.createJwt("e863d057-b2ba-7dc0-7bab-6ef325a24c7d");

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(jwt);

    }
}