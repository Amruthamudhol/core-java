package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dto.SignInDTO;

public interface SignInService {
    boolean validateAndSave(SignInDTO signInDTO);
}
