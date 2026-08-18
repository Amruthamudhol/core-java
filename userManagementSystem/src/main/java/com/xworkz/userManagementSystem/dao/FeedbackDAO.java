package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.FeedbackEntity;
import lombok.Data;


public interface FeedbackDAO {
    public boolean save(FeedbackEntity feedbackEntity);
}
