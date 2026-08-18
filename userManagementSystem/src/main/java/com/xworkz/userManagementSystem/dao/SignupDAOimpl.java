package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.SignupEntity;

public class SignupDAOimpl implements  SignupDAO
{
    @Override
    public boolean save(SignupEntity signupEntity) {
        System.out.println("Running save in SignupDAOimpl");
        System.out.println("signupEntity : " + signupEntity);
        return true;
    }
}
