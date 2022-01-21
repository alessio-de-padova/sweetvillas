package com.nimesia.sweetvillas.dto;

import lombok.Getter;
import lombok.Setter;

public class LoginResultDTO  {
    private @Getter @Setter String token;
    private @Getter @Setter UserDTO user;
}
