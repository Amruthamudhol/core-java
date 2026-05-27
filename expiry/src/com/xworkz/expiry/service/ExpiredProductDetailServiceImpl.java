package com.xworkz.expiry.service;

import com.xworkz.expiry.dto.ExpiredProductDetailDTO;

public class ExpiredProductDetailServiceImpl implements ExpiredProductDetailService{
    @Override
    public boolean validateAndSave(ExpiredProductDetailDTO dto) {

        System.out.println("Expired Product Details are : " + dto);
        return false;
    }
}
