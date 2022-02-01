package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TextDTO extends AbsDTO {
    private @Getter @Setter Integer id;
    @NotNull(message = "TextNull")
    @Size(min = 1, message = "TextLength")
    private @Getter @Setter String text;
    @NotNull(message = "LangNull")
    private @Getter @Setter LangDTO lang;
}