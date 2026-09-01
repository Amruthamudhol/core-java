package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dao.SignInDAO;
import com.xworkz.userManagementSystem.dao.SignInDAOimpl;
import com.xworkz.userManagementSystem.dto.SignInDTO;
import com.xworkz.userManagementSystem.entity.SignInEntity;

public class SignInServiceImpl implements SignInService {

    SignInDAO signInDAO = new SignInDAOimpl();

    @Override
    public boolean validateAndSave(SignInDTO signInDTO) {

        System.out.println("Running validateAndSave() in SignInServiceImpl");
        System.out.println("signInDTO : " + signInDTO);

        if (signInDTO != null) {

            System.out.println("Valid DTO");

            SignInEntity signInEntity = new SignInEntity();

            signInEntity.setUserId(signInDTO.getUserId());
            signInEntity.setPassword(signInDTO.getPassword());

            boolean saved = signInDAO.save(signInEntity);

            System.out.println("DAO result : " + saved);

            return saved;
        }

        return false;
    }
}