package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dao.FeedbackDAO;
import com.xworkz.userManagementSystem.dao.FeedbackDAOimpl;
import com.xworkz.userManagementSystem.dto.FeedbackDTO;
import com.xworkz.userManagementSystem.entity.FeedbackEntity;
import com.xworkz.userManagementSystem.util.ValidationUtil;

import javax.validation.ConstraintViolation;
import java.util.Set;

public class FeedbackServiceImpl implements FeedbackService {

    FeedbackDAO feedbackDAO = new FeedbackDAOimpl();

    @Override
    public boolean validateAndSave(FeedbackDTO feedbackDTO) {

        System.out.println("Running validateAndSave() in FeedbackServiceImpl");
        System.out.println("feedbackDTO : " + feedbackDTO);

        Set<ConstraintViolation<FeedbackDTO>> validation = ValidationUtil.getValidator().validate(feedbackDTO);
        System.out.println("Validation count : " + validation.size());

        if (validation.isEmpty()) {
            System.out.println("DTO validation successful");

            // DTO -> Entity
            FeedbackEntity feedbackEntity = new FeedbackEntity();

            feedbackEntity.setName(feedbackDTO.getName());
            feedbackEntity.setEmail(feedbackDTO.getEmail());
            feedbackEntity.setMobile(feedbackDTO.getMobile());
            feedbackEntity.setComment(feedbackDTO.getComment());

            boolean saved = feedbackDAO.save(feedbackEntity);

            System.out.println("DAO result : " + saved);

            return saved;

        }

        return false;
    }

}
