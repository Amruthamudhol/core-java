package com.xworkz.customer.service;

import com.xworkz.customer.dto.CustomerDetailDTO;

public interface CustomerDetailService {


    boolean validateAndSave(CustomerDetailDTO dto);

}
