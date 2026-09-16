package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.SignupEntity;

import java.util.List;

public interface SignupDAO {
    public boolean save(SignupEntity signupEntity);
    List<SignupEntity> readAllSignupEntities();
}
