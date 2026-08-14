package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dto.SignupDTO;

public class SignupServiceImpl implements  SignupService {
    @Override
    public boolean validateAndSave(SignupDTO signupDTO) {
        System.out.println("Running validateAndSave() in SignupServiceImpl");
        System.out.println("signupDTO:"+signupDTO);
        return true;
    }
}
