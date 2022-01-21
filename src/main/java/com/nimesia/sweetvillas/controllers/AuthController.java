package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.dto.AccountDTO;
import com.nimesia.sweetvillas.dto.LoginDTO;
import com.nimesia.sweetvillas.dto.LoginResultDTO;
import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.mappers.AccountMapper;
import com.nimesia.sweetvillas.mappers.UserMapper;
import com.nimesia.sweetvillas.providers.JwtProvider;
import com.nimesia.sweetvillas.services.AccountService;
import com.nimesia.sweetvillas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Used only as test.
 */
@RestController
class AuthController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper mapper;
    /**
     * Login request
     *
     * @param LoginDTO login
     */
    @PostMapping("/public/auth/login")
    public ResponseEntity login(
            @Valid
            @RequestBody LoginDTO login
    ) {
        UserEntity user = userService.getByEmailAndPassword(login.getEmail(), login.getPwd());

        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        String jwt = JwtProvider.createJwt(user.getId());
        LoginResultDTO dto = new LoginResultDTO();
        dto.setToken(jwt);
        dto.setUser(mapper.map(user));

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(dto);

    }
}