package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.bean.ApiError;
import com.nimesia.sweetvillas.dto.UserDTO;
import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.mappers.UserMapper;
import com.nimesia.sweetvillas.services.AccountService;
import com.nimesia.sweetvillas.services.UserService;
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
    public ResponseEntity get(
            @RequestParam(name = "id") String id
    ) {

        UserEntity user = svc.get(id).get();
        user.getAccount().setPwd(null);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(user);
    }

    /**
     * Search request
     *
     * @param str
     * @param page
     * @param limit
     */
    @GetMapping("/users/search")
    public ResponseEntity search(
            @RequestParam(name = "str", defaultValue = "") String str,
            @RequestParam(name = "page", defaultValue = "0") Integer page,
            @RequestParam(name = "limit", defaultValue = "20") Integer limit
    ) {

        List<UserEntity> userEntities = svc.search(str, page, limit);
        List<UserDTO> users = new ArrayList<>();

        for (UserEntity entity : userEntities) {
            entity.getAccount().setPwd("");
            users.add( mapper.map(entity));
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(users);
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
        List<ApiError> errors = validateAccount(user.getAccount());

        if (errors.size() > 0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errors);
        }

        UserEntity userEntity = mapper.map(user);

        UserEntity newUser = svc.create(userEntity);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newUser.getId());
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

        if (!requestUser.getRole().getId().equals(getADM()) && !requestUser.getId().equals(user.getId())) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }

        List<ApiError> errors = validateEmail(user.getAccount());

        if (errors.size() > 0 ) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errors);
        }

        AccountEntity prevAccount = accountSvc.get(user.getAccount().getId());
        user.getAccount().setPwd(prevAccount.getPwd());
        UserEntity userEntity = mapper.map(user);
        UserEntity newUser = svc.update(userEntity);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newUser.getId());
    }

}