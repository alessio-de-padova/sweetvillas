package com.nimesia.sweetvillas.mappers;

import com.nimesia.sweetvillas.dto.StoreDTO;
import com.nimesia.sweetvillas.entities.StoreEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoreMapper implements Mapper<StoreDTO, StoreEntity>{

    @Autowired
    private ModelMapper mapper;

    @Override
    public StoreEntity map(StoreDTO dto) {
        return mapper.map(dto, StoreEntity.class);
    }

    @Override
    public StoreDTO map(StoreEntity entity) {
        return mapper.map(entity, StoreDTO.class);
    }
}
