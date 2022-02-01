package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

public class AbsDTO implements Serializable {
    private @Getter @Setter Date createdAt;
    private @Getter @Setter Date updatedAt;


}
