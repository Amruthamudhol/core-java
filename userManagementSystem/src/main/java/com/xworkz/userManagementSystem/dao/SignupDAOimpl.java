package com.xworkz.userManagementSystem.dao;

import com.xworkz.userManagementSystem.entity.SignupEntity;

import javax.persistence.*;

public class SignupDAOimpl implements SignupDAO {

    @Override
    public boolean save(SignupEntity signupEntity) {

        System.out.println("Running save in SignupDAOimpl");
        System.out.println("signupEntity : " + signupEntity);

        boolean isSaved = false;

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;

        try {

            emf = Persistence.createEntityManagerFactory("user_management_system");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();

            em.persist(signupEntity);
            et.commit();

            isSaved = true;

            System.out.println("Data saved successfully: " + signupEntity);

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