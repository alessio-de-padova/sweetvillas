package com.nimesia.sweetvillas.bean;

import java.io.Serializable;

public class ApiError implements Serializable {

    private String type;
    private String propertyPath;
    private String invalidValue;


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