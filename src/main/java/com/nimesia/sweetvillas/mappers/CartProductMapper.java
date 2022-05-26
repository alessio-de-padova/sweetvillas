package com.nimesia.sweetvillas.mappers;

import com.nimesia.sweetvillas.dto.CartProductDTO;
import com.nimesia.sweetvillas.models.CartProductEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartProductMapper implements Mapper<CartProductDTO, CartProductEntity>{

    @Autowired
    private ModelMapper mapper;

    @Override
    public CartProductEntity map(CartProductDTO dto) {
        return mapper.map(dto, CartProductEntity.class);
    }

    @Override
    public CartProductDTO map(CartProductEntity entity) {
        return mapper.map(entity, CartProductDTO.class);
    }
}
