package com.nimesia.sweetvillas.bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

public class ApiError implements Serializable {

    private ObjectMapper mapper;
    private String type;
    private String propertyPath;
    private String invalidValue;

    @Bean
    public ApiError ApiError() {
        return new ApiError();
    }

    public void setInvalidValue(String invalidValue) {
        this.invalidValue = invalidValue;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPropertyPath(String propertyPath) {
        this.propertyPath = propertyPath;
    }

    public String getInvalidValue() {
        return this.invalidValue;
    }

    public String getType() {
        return type;
    }

    public String getPropertyPath() {
        return propertyPath;
    }

}