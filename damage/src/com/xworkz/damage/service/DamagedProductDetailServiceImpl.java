package com.xworkz.damage.service;

import com.xworkz.damage.dto.DamagedProductDetailDTO;

public class DamagedProductDetailServiceImpl implements DamagedProductDetailService{
    @Override
    public boolean validateAndSave(DamagedProductDetailDTO dto) {
        System.out.println("Damaged Product Details are :" + dto);
        return false;
    }
}
