package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class UserCartProductDTO extends AbsDTO {
    private @Getter @Setter Integer id;
    private @Getter @Setter ProductInfoDTO product;
    private @Getter @Setter Integer quantity;
    private @Getter @Setter
    BigDecimal totalPrice;
}
