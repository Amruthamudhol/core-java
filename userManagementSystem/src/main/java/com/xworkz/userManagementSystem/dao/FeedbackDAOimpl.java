package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.FeedbackEntity;
import com.xworkz.userManagementSystem.util.EntityManagerFactoryUtil;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
public class FeedbackDAOimpl implements FeedbackDAO {
    @Override
    public boolean save(FeedbackEntity feedbackEntity) {

        System.out.println("Running save in FeedbackDAOimpl");
        System.out.println("FeedbackEntity : " + feedbackEntity);
        boolean isSaved = false;

        EntityManager em = null;
        EntityTransaction et = null;

        try {

            em = EntityManagerFactoryUtil.getEmf().createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(feedbackEntity);
            et.commit();
            isSaved = true;
            System.out.println("Feedback saved successfully : " + feedbackEntity);

        } catch (PersistenceException p) {
            p.printStackTrace();
            if (et != null) {
                et.rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }
        }

        return isSaved;
    }
}


