package com.nimesia.sweetvillas.controllers;

import com.nimesia.sweetvillas.bean.ApiError;
import com.nimesia.sweetvillas.dto.AccountDTO;

import java.util.ArrayList;

public class AbsController {

    public ArrayList<ApiError> validatePwd(
            AccountDTO account
    ) {
        ArrayList<ApiError> errors = new ArrayList<>();

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
}
