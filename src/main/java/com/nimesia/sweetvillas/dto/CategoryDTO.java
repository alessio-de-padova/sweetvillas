package com.nimesia.sweetvillas.dto;

import com.nimesia.sweetvillas.dto.AbsDTO;
import com.nimesia.sweetvillas.dto.TextDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import java.util.Set;

public class CategoryDTO extends AbsDTO {
    private @Getter @Setter String id;
    @Valid
    private @Getter @Setter Set<TextDTO> texts;

}
