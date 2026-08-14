package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dto.SignInDTO;

public class SignInServiceImpl implements  SignInService{
    @Override
    public boolean validateAndSave(SignInDTO signInDTO) {
        System.out.println("Running validateAndSave() in SignInServiceImpl");
        System.out.println("signInDTO:"+signInDTO);
        return true;
    }
}
