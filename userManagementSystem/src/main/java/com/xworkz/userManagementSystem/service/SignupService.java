package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dto.SignupDTO;

public interface SignupService {
    boolean validateAndSave(SignupDTO signupDTO);
}
