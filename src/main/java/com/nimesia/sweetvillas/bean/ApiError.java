package com.nimesia.sweetvillas.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class ApiError implements Serializable {

    @Getter
    private  String type;
    @Getter
    private  String propertyPath;
    @Getter
    private  String invalidValue;

    public ApiError builder(String type, String propertyPath, String invalidValue) {
        this.invalidValue = invalidValue;
        this.type = type;
        this.propertyPath = propertyPath;
        return this;
    }




}