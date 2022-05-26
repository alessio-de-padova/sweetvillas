package com.nimesia.sweetvillas.mappers;

import com.nimesia.sweetvillas.dto.AccountDTO;
import com.nimesia.sweetvillas.models.AccountEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper implements Mapper<AccountDTO, AccountEntity> {
    @Autowired
    private ModelMapper mapper;

    @Override
    public AccountEntity map(AccountDTO dto) {
        return mapper.map(dto, AccountEntity.class);
    }

    @Override
    public AccountDTO map(AccountEntity entity) {
        return mapper.map(entity, AccountDTO.class);
    }
}
