package com.xworkz.userManagementSystem.service;

import com.xworkz.userManagementSystem.dao.FeedbackDAO;
import com.xworkz.userManagementSystem.dao.FeedbackDAOimpl;
import com.xworkz.userManagementSystem.dto.FeedbackDTO;
import com.xworkz.userManagementSystem.entity.FeedbackEntity;
import lombok.*;


@Getter
@Setter
@ToString
public class FeedbackServiceImpl implements FeedbackService {


    @Override
    public boolean validateAndSave(FeedbackDTO feedbackDTO) {
        System.out.println("Running validateAndSave() in FeedbackServiceImpl");
        System.out.println("feedBackDTO:"+feedbackDTO);

      if(feedbackDTO!=null){
          System.out.println("valid dto");

          FeedbackEntity feedbackEntity = new FeedbackEntity();
          feedbackEntity.setName(feedbackDTO.getName());
          feedbackEntity.setEmail(feedbackDTO.getEmail());
          feedbackEntity.setMobile(feedbackDTO.getMobile());
          feedbackEntity.setComment(feedbackDTO.getComment());

          FeedbackDAO feedbackDAO = new FeedbackDAOimpl();
          feedbackDAO.save(feedbackEntity);
      }
        return true;
    }
}
