package com.dev.backendspringboot.api.dto.request;

import lombok.Data;

@Data
public class LogInRequest {
    private String email;
    private String password;
}
