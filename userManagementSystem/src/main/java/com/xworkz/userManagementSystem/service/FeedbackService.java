package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dto.FeedbackDTO;

public interface FeedbackService {
    boolean validateAndSave(FeedbackDTO feedbackDTO);

}
