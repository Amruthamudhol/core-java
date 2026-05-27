package com.xworkz.expiry.runner;

import com.xworkz.expiry.dto.ExpiredProductDetailDTO;
import com.xworkz.expiry.service.ExpiredProductDetailService;
import com.xworkz.expiry.service.ExpiredProductDetailServiceImpl;

public class runner {

    public static void main(String[] args) {

        ExpiredProductDetailService expiredProductDetailService = new ExpiredProductDetailServiceImpl();
        ExpiredProductDetailDTO expiredProductDetailDTO = new ExpiredProductDetailDTO(201, "Milk Packet", "10-05-2026", 35.0, "Nandini");
        expiredProductDetailService.validateAndSave(expiredProductDetailDTO);
    }
}
