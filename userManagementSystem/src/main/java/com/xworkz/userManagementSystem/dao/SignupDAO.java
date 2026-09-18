package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.SignupEntity;

import java.util.List;

public interface SignupDAO {
    public boolean save(SignupEntity signupEntity);
    List<SignupEntity> readAllSignupEntities();
    SignupEntity updateSignupById(String userId);
    Boolean updateSignupDto(SignupEntity signupEntity);
  //  Boolean deleteSignupById(String userId);

}
