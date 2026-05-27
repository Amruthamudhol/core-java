package com.xworkz.customer.runner;

import com.xworkz.customer.dto.CustomerDetailDTO;
import com.xworkz.customer.service.CustomerDetailService;
import com.xworkz.customer.service.CustomerDetailServiceImpl;

public class runner {

    public static void main(String[] args) {

        CustomerDetailService customerDetailService = new CustomerDetailServiceImpl();

        CustomerDetailDTO customerDetailDTO = new CustomerDetailDTO(101, "Amruta", "amruta@gmail.com", 9876543210L, "Bangalore");
        customerDetailService.validateAndSave(customerDetailDTO);
    }
}
