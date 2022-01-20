package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.bean.ApiError;
import com.nimesia.sweetvillas.dto.UserDTO;
import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.mappers.UserMapper;
import com.nimesia.sweetvillas.services.AccountService;
import com.nimesia.sweetvillas.services.UserService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
class UserController extends AbsController{

    @Autowired
    private UserService svc;
    @Autowired
    private AccountService accountSvc;
    @Autowired
    private UserMapper mapper;



    @GetMapping("/users/get")
    public UserEntity get(
            @RequestParam(name = "id") String id
    ) {

        UserEntity user = svc.get(id).get();
        user.getAccount().setPwd(null);
        return user;
    }

    @GetMapping("/users/search")
    public List<UserEntity> search(
            @RequestParam(name = "str", defaultValue = "") String str,
            @RequestParam(name = "birthCity", defaultValue = "0") Integer birthCityId,
            @RequestParam(name = "page", defaultValue = "0") Integer page,
            @RequestParam(name = "size", defaultValue = "20") Integer limit
    ) throws JSONException {

        JSONObject params = new JSONObject();

        if (str.length() > 0) {
            params.put("str", str);
        }

        if (birthCityId != 0) {
            params.put("birthCityId", birthCityId);
        }

        params.put("page", page);
        params.put("limit", limit);

        return svc.search(params);
    }

    @PostMapping("/users/create")
    @Valid
    public ResponseEntity create(
            @Valid
            @RequestBody UserDTO user
    ) {

        List<ApiError> errors = validatePwd( user.getAccount() );

        if (errors.size() > 0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errors);
        }

        UserEntity userEntity = mapper.map(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(svc.save(userEntity));

    }

    @PostMapping("/users/update")
    public ResponseEntity update(
            @Valid
            @RequestBody UserDTO user
    ) {

        AccountEntity prevAccount = accountSvc.get(user.getAccount().getId());
        user.getAccount().setPwd(prevAccount.getPwd());

        UserEntity userEntity = mapper.map(user);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(svc.save(userEntity));
    }

}