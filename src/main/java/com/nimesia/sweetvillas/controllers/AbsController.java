package com.nimesia.sweetvillas.controllers;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.nimesia.sweetvillas.bean.ApiError;
import com.nimesia.sweetvillas.dto.AccountDTO;
import com.nimesia.sweetvillas.entities.AccountEntity;
import com.nimesia.sweetvillas.entities.UserEntity;
import com.nimesia.sweetvillas.services.AccountService;
import com.nimesia.sweetvillas.services.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Optional;

public class AbsController {
    @Autowired
    private HttpServletRequest context;
    @Autowired
    private UserService userService;
    @Autowired
    private AccountService accountService;
    private static final @Getter
    String ADM = "ADM";
    private static final @Getter
    String STR = "STR";

    public ArrayList<ApiError> validateAccount(
            AccountDTO account
    ) {
        ArrayList<ApiError> errors = validateEmail(account);

        if (!account.pdwMatch()) {
            ApiError error = new ApiError();
            error.setType("PwdNotMatching");
            error.setPropertyPath("pwd");
            errors.add(error);
        }

        if (!account.isPwdValid()) {
            ApiError error = new ApiError();
            error.setType("PwdNotValid");
            error.setPropertyPath("pwd");
            errors.add(error);
        }

        return errors;
    }

    public ArrayList<ApiError> validateEmail(
            AccountDTO account
    ) {
        ArrayList<ApiError> errors = new ArrayList<>();

        AccountEntity accountEntity = accountService.getByEmail(account.getEmail());

        if (accountEntity != null && !accountEntity.getId().equals(account.getId())) {
            ApiError error = new ApiError();
            error.setType("EmailExists");
            error.setPropertyPath("email");
            errors.add(error);
        }

        return errors;
    }

    public UserEntity getRequestUser() {
        DecodedJWT decoded = (DecodedJWT) context.getAttribute("decoded");
        return userService.get(decoded.getSubject());

    }
}
