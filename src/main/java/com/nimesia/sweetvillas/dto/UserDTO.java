package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class UserDTO extends AbsDTO {
    private @Getter @Setter String id;
    @NotNull(message = "NameNull")
    @Size(min = 1, message = "NameLength")
    private @Getter @Setter String name;
    @Size(min = 1, message = "SurnameLength")
    @NotNull(message = "SurnameNull")
    private @Getter @Setter String surname;
    @NotNull(message = "FiscalCodeNull")
    @Size(min=16, max=16, message = "FiscalCodeInvalid")
    private @Getter @Setter String fiscalCode;
    @Valid
    private @Getter @Setter AccountDTO account;
    private @Getter @Setter RoleDTO role;
    private @Getter @Setter List<UserSpecDTO> specs;
}