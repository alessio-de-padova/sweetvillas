package com.nimesia.sweetvillas.mappers;

import com.nimesia.sweetvillas.dto.CategoryDTO;
import com.nimesia.sweetvillas.entities.CategoryEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper implements Mapper<CategoryDTO, CategoryEntity>{

    @Autowired
    private ModelMapper mapper;

    @Override
    public CategoryEntity map(CategoryDTO dto) {
        return mapper.map(dto, CategoryEntity.class);
    }

    @Override
    public CategoryDTO map(CategoryEntity entity) {
        return mapper.map(entity, CategoryDTO.class);
    }
}
