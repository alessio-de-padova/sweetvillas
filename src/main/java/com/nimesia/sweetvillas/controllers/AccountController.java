package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.bean.ApiError;
import com.nimesia.sweetvillas.dto.AccountDTO;
import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.mappers.AccountMapper;
import com.nimesia.sweetvillas.services.AccountService;
import com.nimesia.sweetvillas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
class AccountController extends AbsController{

    @Autowired
    private AccountService svc;
    @Autowired
    private UserService userService;
    @Autowired
    private AccountMapper mapper;

    /**
     * UpdatePassword request
     *
     * @param account
     */
    @PostMapping("/account/update-password")
    public ResponseEntity updatePassword(
            @Valid
            @RequestBody AccountDTO account
    ) {

        UserEntity requestUser = getRequestUser();

        if ( !requestUser.getRole().getId().equals(getADM()) && !requestUser.getAccount().getId().equals(account.getId())  ) {

            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }

        List<ApiError> errors = validatePwd(account);

        if (errors.size() > 0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errors);
        }

        AccountEntity accountEntity = mapper.map(account);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(svc.update(accountEntity));

    }

}