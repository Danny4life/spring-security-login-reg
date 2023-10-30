package com.osiki.springsecurityloginregistrationtutorial.DTO;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
