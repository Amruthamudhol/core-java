package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.SignupEntity;
import com.xworkz.userManagementSystem.util.EntityManagerFactoryUtil;

import javax.persistence.*;

public class SignupDAOimpl implements SignupDAO {

    @Override
    public boolean save(SignupEntity signupEntity) {

        System.out.println("Running save in SignupDAOimpl");
        System.out.println("signupEntity : " + signupEntity);

        boolean isSaved = false;

        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EntityManagerFactoryUtil.getEmf().createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(signupEntity);
            et.commit();

            isSaved = true;
            System.out.println("Data saved successfully: " + signupEntity);

        } catch (PersistenceException e) {

            e.printStackTrace();

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