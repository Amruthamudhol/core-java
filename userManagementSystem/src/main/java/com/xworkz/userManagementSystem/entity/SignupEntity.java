package com.xworkz.userManagementSystem.entity;

import lombok.Data;

@Data
public class SignupEntity {
    private String userId;
    private String email;
    private String password;
    private String confirmPassword;
}
