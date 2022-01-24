package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.bean.ApiError;
import com.nimesia.sweetvillas.dto.LoginDTO;
import com.nimesia.sweetvillas.dto.LoginResultDTO;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.mappers.UserMapper;
import com.nimesia.sweetvillas.providers.JwtProvider;
import com.nimesia.sweetvillas.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * AuthController
 */
@RestController
class AuthController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper mapper;
    private Logger logger = LoggerFactory.getLogger(AuthController.class);

    /**
     * Login request
     *
     * @param login
     */
    @PostMapping("/public/auth/login")
    public ResponseEntity login(
            @Valid
            @RequestBody LoginDTO login
    ) {
        UserEntity user = userService.getByEmailAndPassword(login.getEmail(), login.getPwd());

        if (user == null) {
            ApiError error = new ApiError();
            error.setType("InvalidLogin");
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body(error);
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