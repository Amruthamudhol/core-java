package com.xworkz.damage.runner;

import com.xworkz.damage.dto.DamagedProductDetailDTO;
import com.xworkz.damage.service.DamagedProductDetailService;
import com.xworkz.damage.service.DamagedProductDetailServiceImpl;

public class runner {

    public static void main(String[] args) {

        DamagedProductDetailService damagedProductDetailService = new DamagedProductDetailServiceImpl();

        DamagedProductDetailDTO damagedProductDetailDTO =new DamagedProductDetailDTO(301, "curd Packet", "Package Tear", 45.0, "Banglore Warehouse");
        damagedProductDetailService.validateAndSave(damagedProductDetailDTO);
    }
}
