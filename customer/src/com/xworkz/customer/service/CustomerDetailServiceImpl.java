package com.xworkz.customer.service;

import com.xworkz.customer.dto.CustomerDetailDTO;

public class CustomerDetailServiceImpl implements CustomerDetailService{
    @Override
    public boolean validateAndSave(CustomerDetailDTO dto) {
        System.out.println("Customer Details : " +dto);

        int customerId = dto.getCustomerId();
        if (customerId > 0)
        {
            System.out.println("Valid Customer Id");
        }
        else {
            System.err.println("Invalid Customer Id");
            return false;
        }

        String customerName = dto.getCustomerName();
        if (customerName != null && customerName.length() >= 3 && customerName.length() <= 100 && customerName.matches("[a-zA-Z ]+"))
        {
            System.out.println("Valid Customer Name");
        }
        else {
            System.err.println("Invalid Customer Name");
            return false;
        }

        String email = dto.getEmail();
        if (email != null && email.contains("@")) {
            System.out.println("Valid Email");
        } else
        {
            System.err.println("Invalid Email");
            return false;
        }

        String address = dto.getAddress();
        if (address != null && address.length() >= 5 && address.length() <= 200)
        {
            System.out.println("Valid Address");
        } else
        {
            System.err.println("Invalid Address");
            return false;
        }

        return true;
    }
}

