package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.FeedbackEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
public class FeedbackDAOimpl implements FeedbackDAO{
    @Override
    public boolean save(FeedbackEntity feedbackEntity) {
        System.out.println("Running save in FeedbackDAOimpl");
        System.out.println("FeedbackEntity : " + feedbackEntity);
        boolean isSaved = false;

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;

        try {

            emf = Persistence.createEntityManagerFactory("user_management_system");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();

            em.persist(feedbackEntity);

            et.commit();
            isSaved = true;
            System.out.println("Feedback saved successfully : " + feedbackEntity);

        } catch (PersistenceException e) {

            if (et != null ) {
                et.rollback();
            }

            e.printStackTrace();

        } finally {

            if (em != null) {
                em.close();
            }

            if (emf != null) {
                emf.close();
            }
        }

        return isSaved;
    }
}


