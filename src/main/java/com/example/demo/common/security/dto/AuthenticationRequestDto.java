package com.example.demo.common.security.dto;

import lombok.Data;

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;

}
