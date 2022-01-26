package com.nimesia.sweetvillas.mappers;

import com.nimesia.sweetvillas.dto.SpecDTO;
import com.nimesia.sweetvillas.entities.SpecEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpecMapper implements Mapper<SpecDTO, SpecEntity>{

    @Autowired
    private ModelMapper mapper;

    @Override
    public SpecEntity map(SpecDTO dto) {
        return mapper.map(dto, SpecEntity.class);
    }

    @Override
    public SpecDTO map(SpecEntity entity) {
        return mapper.map(entity, SpecDTO.class);
    }
}
