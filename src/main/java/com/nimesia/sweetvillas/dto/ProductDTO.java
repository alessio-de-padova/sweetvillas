package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

public class ProductDTO extends AbsDTO {
    private @Getter @Setter Integer id;
    private @Getter @Setter Set<TextDTO> names;
    private @Getter @Setter Set<CategoryDTO> categories;
    private @Getter @Setter Number price;
}
