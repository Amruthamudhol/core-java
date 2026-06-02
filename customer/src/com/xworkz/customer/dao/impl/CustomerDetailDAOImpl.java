package com.xworkz.customer.dao.impl;

import com.xworkz.customer.dao.CustomerDetailDAO;

public class CustomerDetailDAOImpl implements CustomerDetailDAO {
    @Override
    public void save(CustomerDetailDAO customerDetailDAO) {
        System.out.println("Running save in CustomerDetailDAOImpl ");
    }
}
