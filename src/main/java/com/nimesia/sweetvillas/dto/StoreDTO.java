package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

public class StoreDTO extends AbsDTO {
    private @Getter @Setter Integer id;
    private @Getter @Setter String name;
    private @Getter @Setter Set<ProductDTO> products;
    private @Getter @Setter String street;
    private @Getter @Setter Integer postalCode;
    private @Getter @Setter CityDTO city;

}
