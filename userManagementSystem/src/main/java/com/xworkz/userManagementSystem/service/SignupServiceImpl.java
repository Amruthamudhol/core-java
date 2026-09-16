package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dao.SignupDAO;
import com.xworkz.userManagementSystem.dao.SignupDAOimpl;
import com.xworkz.userManagementSystem.dto.SignupDTO;
import com.xworkz.userManagementSystem.entity.SignupEntity;
import com.xworkz.userManagementSystem.util.ValidationUtil;

import javax.validation.ConstraintViolation;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SignupServiceImpl implements SignupService {

    SignupDAO signupDAO = new SignupDAOimpl();
    @Override
    public boolean validateAndSave(SignupDTO signupDTO) {

        System.out.println("Running validateAndSave() in SignupServiceImpl");
        System.out.println("signupDTO : " + signupDTO);

        Set<ConstraintViolation<SignupDTO>> validation = ValidationUtil.getValidator().validate(signupDTO);
        System.out.println("Validation count : " + validation.size());

        if (validation.isEmpty()) {

            System.out.println("DTO validation successful");

            // DTO -> Entity
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




    @Override
    public List<SignupDTO> getAllSignupDto() {
        List<SignupEntity> signupEntities = signupDAO.readAllSignupEntities();
        System.out.println("Signup Entities : " + signupEntities);

        if (signupEntities != null) {

            return signupEntities.stream()
                    .map(entity -> new SignupDTO(
                            entity.getUserId(),
                            entity.getEmail(),
                            entity.getPassword(),
                            entity.getConfirmPassword()
                    ))
                    .collect(Collectors.toList());
        }

        return Collections.emptyList();
    }
    }
