package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.SignInEntity;

import javax.persistence.*;

public class SignInDAOimpl implements  SignInDAO {
    @Override
    public boolean save(SignInEntity signInEntity) {
        System.out.println("Running save in SignInDAOimpl");
        System.out.println("signInEntity : " + signInEntity);
        boolean isSaved = false;

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;

        try {

            emf = Persistence.createEntityManagerFactory("user_management_system");
            em = emf.createEntityManager();
            et = em.getTransaction();

            et.begin();

            em.persist(signInEntity);

            et.commit();

            isSaved = true;

            System.out.println("SignIn data saved successfully : " + signInEntity);

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
