package com.nimesia.sweetvillas.controllers;

import java.util.ArrayList;

import com.nimesia.sweetvillas.bean.ApiError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler{

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        ArrayList errors = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach((error) ->{
            ApiError apiError = new ApiError();
            apiError.setPropertyPath(((FieldError) error).getField());
            apiError.setType(error.getDefaultMessage());
            apiError.setInvalidValue(apiError.getInvalidValue());
            errors.add(apiError);
        });
        return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
    }
}