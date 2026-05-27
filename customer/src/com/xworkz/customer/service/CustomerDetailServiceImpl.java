package com.xworkz.customer.service;

import com.xworkz.customer.dto.CustomerDetailDTO;

public class CustomerDetailServiceImpl implements CustomerDetailService{
    @Override
    public boolean validateAndSave(CustomerDetailDTO dto) {
        System.out.println("Customer Details : " +dto);
        return false;
    }
}
