package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

public class TextDTO extends AbsDTO {
    private @Getter @Setter String id;
    private @Getter @Setter String text;
    private @Getter @Setter LangDTO lang;

}
