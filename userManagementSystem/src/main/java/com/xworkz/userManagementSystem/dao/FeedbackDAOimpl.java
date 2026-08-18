package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.FeedbackEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FeedbackDAOimpl implements FeedbackDAO{
    @Override
    public boolean save(FeedbackEntity feedbackEntity) {
        System.out.println("Running save in FeedbackDAOimpl");
        System.out.println("FeedbackEntity : " + feedbackEntity);
        return true;
    }
}
