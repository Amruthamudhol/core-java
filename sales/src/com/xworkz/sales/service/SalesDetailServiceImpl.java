package com.xworkz.sales.service;

import com.xworkz.sales.dto.SalesDetailDTO;

public class SalesDetailServiceImpl implements SalesDetailService {

    @Override
    public boolean validateAndSave(SalesDetailDTO dto) {

        System.out.println("Saving details : " + dto);
             return false;
    }
}