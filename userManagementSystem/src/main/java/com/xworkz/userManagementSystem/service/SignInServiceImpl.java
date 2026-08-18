package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dto.SignInDTO;
import com.xworkz.userManagementSystem.entity.SignInEntity;

public class SignInServiceImpl implements  SignInService{
    @Override
    public boolean validateAndSave(SignInDTO signInDTO) {
        System.out.println("Running validateAndSave() in SignInServiceImpl");
        System.out.println("signInDTO:"+signInDTO);
        if (signInDTO!=null){
            System.out.println("valid dto");

            SignInEntity signInEntity = new SignInEntity();
            signInEntity.setUserId(signInEntity.getUserId());
            signInEntity.setPassword(signInEntity.getPassword());
        }
        return true;
    }
}
