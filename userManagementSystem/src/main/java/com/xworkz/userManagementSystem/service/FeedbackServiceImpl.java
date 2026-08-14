package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dto.FeedbackDTO;

public class FeedbackServiceImpl implements FeedbackService {

    @Override
    public boolean validateAndSave(FeedbackDTO feedbackDTO) {
        System.out.println("Running validateAndSave() in FeedbackServiceImpl");
        System.out.println("feedBackDTO:"+feedbackDTO);

        return true;
    }
}
