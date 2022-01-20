package com.nimesia.sweetvillas.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class AccountDTO extends AbsDTO {
    private @Getter @Setter Integer id;
    @NotEmpty
    @Email(message = "EmailInvalid")
    private @Getter @Setter String email;
    private @Getter @Setter Boolean enabled;
    private @Getter @Setter String pwd;
    private @Getter @Setter String pwd2;

    public boolean pdwMatch() {
        return this.pwd.equals(this.pwd2);
    }

    public boolean isPwdValid() {
        String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{5,}$";
        return this.pwd.matches(regex);
    }
}
