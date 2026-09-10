package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.SignInEntity;
import com.xworkz.userManagementSystem.util.EntityManagerFactoryUtil;

import javax.persistence.*;

public class SignInDAOimpl implements  SignInDAO {
    @Override
    public boolean save(SignInEntity signInEntity) {
        System.out.println("Running save in SignInDAOimpl");
        System.out.println("SignInEntity : " + signInEntity);

        boolean isSaved = false;

        EntityManager em = null;
        EntityTransaction et = null;

        try {

            em = EntityManagerFactoryUtil.getEmf().createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(signInEntity);
            et.commit();

            isSaved = true;
            System.out.println("SignIn data saved successfully : " + signInEntity);

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