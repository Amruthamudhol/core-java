package com.xworkz.userManagementSystem.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class SignInDTO {
    private String userId;
    private String password;

    public SignInDTO(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    @Override
    public String toString() {
        return "SignInDTO{" +
                "userId='" + userId + '\'' +
                '}';
    }
}
