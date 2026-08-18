package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dto.SignupDTO;
import com.xworkz.userManagementSystem.entity.SignupEntity;

public class SignupServiceImpl implements  SignupService {
    @Override
    public boolean validateAndSave(SignupDTO signupDTO) {
        System.out.println("Running validateAndSave() in SignupServiceImpl");
        System.out.println("signupDTO:"+signupDTO);

        if (signupDTO!=null){
            System.out.println("valid dto");
            SignupEntity signupEntity = new SignupEntity();
            signupEntity.setUserId(signupDTO.getUserId());
            signupEntity.setEmail(signupDTO.getEmail());
            signupEntity.setPassword(signupDTO.getPassword());
            signupEntity.setConfirmPassword(signupDTO.getConfirmPassword());
        }
        return true;
    }
}
