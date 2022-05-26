package com.nimesia.sweetvillas.mappers;

import com.nimesia.sweetvillas.dto.AbsDTO;
import com.nimesia.sweetvillas.models.AbsEntity;

public interface Mapper<S extends AbsDTO,T extends AbsEntity> {

    T map(S source);
    S map(T target);

}
