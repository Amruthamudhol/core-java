package com.xworkz.userManagementSystem.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class SignupDTO {
    private String userId;
    private String email;
    private String password;
    private String confirmPassword;

    public SignupDTO(String userId, String email, String password, String confirmPassword) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


}
