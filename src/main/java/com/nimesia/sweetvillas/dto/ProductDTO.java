package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class ProductDTO extends AbsDTO {
    private @Getter @Setter Integer id;
    @Valid
    private @Getter @Setter List<TextDTO> names;
    @Valid
    private @Getter @Setter List<CategoryDTO> categories;
    private @Getter @Setter BigDecimal price;
    private @Getter @Setter Integer quantity;
    private @Getter @Setter StoreInfoDTO store;
}