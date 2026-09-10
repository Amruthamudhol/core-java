package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dao.SignInDAO;
import com.xworkz.userManagementSystem.dao.SignInDAOimpl;
import com.xworkz.userManagementSystem.dto.SignInDTO;
import com.xworkz.userManagementSystem.entity.SignInEntity;
import com.xworkz.userManagementSystem.util.ValidationUtil;

import javax.validation.ConstraintViolation;
import java.util.Set;

public class SignInServiceImpl implements SignInService {

    SignInDAO signInDAO = new SignInDAOimpl();

    @Override
    public boolean validateAndSave(SignInDTO signInDTO) {

        System.out.println("Running validateAndSave() in SignInServiceImpl");
        System.out.println("signInDTO : " + signInDTO);

        Set<ConstraintViolation<SignInDTO>> validation = ValidationUtil.getValidator().validate(signInDTO);
        System.out.println("Validation count : " + validation.size());

        if (validation.isEmpty()) {

            System.out.println("DTO validation successful");

            // DTO -> Entity
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