package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dao.SignupDAO;
import com.xworkz.userManagementSystem.dao.SignupDAOimpl;
import com.xworkz.userManagementSystem.dto.SignupDTO;
import com.xworkz.userManagementSystem.entity.SignupEntity;

public class SignupServiceImpl implements SignupService {

    SignupDAO signupDAO = new SignupDAOimpl();

    @Override
    public boolean validateAndSave(SignupDTO signupDTO) {

        System.out.println("Running validateAndSave() in SignupServiceImpl");
        System.out.println("signupDTO:" + signupDTO);

        if (signupDTO != null) {

            System.out.println("valid dto");

            SignupEntity signupEntity = new SignupEntity();

            signupEntity.setUserId(signupDTO.getUserId());
            signupEntity.setEmail(signupDTO.getEmail());
            signupEntity.setPassword(signupDTO.getPassword());
            signupEntity.setConfirmPassword(signupDTO.getConfirmPassword());

            boolean saved = signupDAO.save(signupEntity);
            System.out.println("DAO result : " + saved);

            return saved;
        }

        return false;
    }
}