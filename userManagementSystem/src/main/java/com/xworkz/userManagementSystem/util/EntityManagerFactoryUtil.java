package com.xworkz.userManagementSystem.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("user_management_system");

    public static EntityManagerFactory getEmf() {
        return emf;
    }
}
