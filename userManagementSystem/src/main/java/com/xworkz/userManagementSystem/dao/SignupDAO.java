package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.SignupEntity;
import lombok.Data;

public interface SignupDAO {
    public boolean save(SignupEntity signupEntity);
}
