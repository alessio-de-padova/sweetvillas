package com.nimesia.sweetvillas.controllers;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.nimesia.sweetvillas.bean.ApiError;
import com.nimesia.sweetvillas.dto.AccountDTO;
import com.nimesia.sweetvillas.models.AccountEntity;
import com.nimesia.sweetvillas.models.UserEntity;
import com.nimesia.sweetvillas.services.AccountService;
import com.nimesia.sweetvillas.services.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

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
            errors.add(
                    new ApiError()
                            .builder(
                                    "PwdNotMatching",
                                    "pwd",
                                    null
                            )
            );
        }

        if (!account.isPwdValid()) {
            errors.add(
                    new ApiError()
                            .builder(
                                    "PwdNotValid",
                                    "pwd",
                                    null
                            )
            );
        }

        return errors;
    }

    public ArrayList<ApiError> validateEmail(
            AccountDTO account
    ) {
        ArrayList<ApiError> errors = new ArrayList<>();

        if (accountService.emailExists(account.getEmail(), account.getId())) {
            errors.add(
                    new ApiError()
                            .builder(
                                    "EmailExists",
                                    "email",
                                    account.getEmail()
                            )
            );

        }

        return errors;
    }

    public UserEntity getRequestUser() {
        DecodedJWT decoded = (DecodedJWT) context.getAttribute("decoded");
        return userService.get(decoded.getSubject()).get();
    }
}
