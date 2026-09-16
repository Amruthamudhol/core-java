package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dto.SignupDTO;

import java.util.List;

public interface SignupService {
    boolean validateAndSave(SignupDTO signupDTO);
    List<SignupDTO> getAllSignupDto();
}
