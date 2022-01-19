package com.nimesia.sweetvillas.mappers;

import com.nimesia.sweetvillas.dto.UserDTO;
import com.nimesia.sweetvillas.entities.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<UserDTO, UserEntity>{

    @Autowired
    private ModelMapper mapper;

    @Override
    public UserEntity map(UserDTO dto) {
        return mapper.map(dto, UserEntity.class);
    }

    @Override
    public UserDTO map(UserEntity entity) {
        return mapper.map(entity, UserDTO.class);
    }
}
