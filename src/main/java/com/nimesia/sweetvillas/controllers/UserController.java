package com.nimesia.sweetvillas.controllers;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.nimesia.sweetvillas.bean.ApiError;
import com.nimesia.sweetvillas.config.SecurityConfig;
import com.nimesia.sweetvillas.dto.UserDTO;
import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.mappers.UserMapper;
import com.nimesia.sweetvillas.providers.JwtProvider;
import com.nimesia.sweetvillas.services.AccountService;
import com.nimesia.sweetvillas.services.UserService;
import lombok.Getter;
import org.apache.catalina.User;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
class UserController extends AbsController {

    @Autowired
    private UserService svc;
    @Autowired
    private AccountService accountSvc;
    @Autowired
    private UserMapper mapper;


    /**
     * Get by id request
     *
     * @param id
     */
    @GetMapping("/users/get")
    public UserEntity get(
            @RequestParam(name = "id") String id
    ) {
        UserEntity user = svc.get(id).get();
        user.getAccount().setPwd(null);
        return user;
    }

    /**
     * Search request
     *
     * @param str
     * @param page
     * @param limit
     */
    @GetMapping("/users/search")
    public List<UserEntity> search(
            @RequestParam(name = "str", defaultValue = "") String str,
            @RequestParam(name = "page", defaultValue = "0") Integer page,
            @RequestParam(name = "limit", defaultValue = "20") Integer limit
    ) throws JSONException {

        return svc.search(str, page, limit);
    }

    /**
     * Create request
     *
     * @param user
     */
    @PostMapping("/public/users/create")
    @Valid
    public ResponseEntity create(
            @Valid @RequestBody UserDTO user
    ) {
        List<ApiError> errors = validatePwd(user.getAccount());

        if (errors.size() > 0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errors);
        }

        UserEntity userEntity = mapper.map(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(svc.create(userEntity));

    }

    /**
     * Update request
     *
     * @param user A user, if not admin, can update only its own info
     */
    @PostMapping("/users/update")
    public ResponseEntity update(
            @Valid
            @RequestBody UserDTO user
    ) {

        UserEntity requestUser = getRequestUser();

        if ( !requestUser.getRole().getId().equals(getADM()) && !requestUser.getId().equals(user.getId()) ) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }

        AccountEntity prevAccount = accountSvc.get(user.getAccount().getId());
        user.getAccount().setPwd(prevAccount.getPwd());
        UserEntity userEntity = mapper.map(user);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(svc.update(userEntity));
    }

}