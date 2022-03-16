package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

public class StoreInfoDTO extends AbsDTO {
    private @Getter @Setter Integer id;
    private @Getter @Setter String name;
    private @Getter @Setter String street;
    private @Getter @Setter Integer postalCode;
    @Valid
    private @Getter @Setter CityDTO city;
}
