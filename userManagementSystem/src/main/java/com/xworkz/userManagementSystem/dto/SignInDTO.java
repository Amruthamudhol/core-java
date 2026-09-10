package com.xworkz.userManagementSystem.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class SignInDTO {
    @NotBlank(message = "User ID is required")
    private String userId;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
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
