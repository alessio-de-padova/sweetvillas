package com.nimesia.sweetvillas.mappers;

import com.nimesia.sweetvillas.dto.ProductDTO;
import com.nimesia.sweetvillas.entities.ProductEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements Mapper<ProductDTO, ProductEntity>{

    @Autowired
    private ModelMapper mapper;

    @Override
    public ProductEntity map(ProductDTO dto) {
        return mapper.map(dto, ProductEntity.class);
    }

    @Override
    public ProductDTO map(ProductEntity entity) {
        return mapper.map(entity, ProductDTO.class);
    }
}
