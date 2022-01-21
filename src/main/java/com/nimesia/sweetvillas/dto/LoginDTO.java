package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class LoginDTO  {
    @NotEmpty @Email(message = "EmailInvalid")
    private @Getter @Setter String email;
    @NotEmpty(message = "PwdInvalid")
    private @Getter @Setter String pwd;
}
