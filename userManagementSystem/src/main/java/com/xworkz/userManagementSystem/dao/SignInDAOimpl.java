package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.SignInEntity;

public class SignInDAOimpl implements  SignInDAO {
    @Override
    public boolean save(SignInEntity signInEntity) {
        System.out.println("Running save in SignInDAOimpl");
        System.out.println("signInEntity : " + signInEntity);
        return true;
    }
}
