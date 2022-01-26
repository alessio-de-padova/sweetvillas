package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

public class SpecDTO extends AbsDTO {
    private @Getter @Setter String id;
    private @Getter @Setter Set<TextDTO> texts;

}
