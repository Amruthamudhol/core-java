package com.xworkz.expiry.runner;

import com.xworkz.expiry.dao.ExpiredProductDAO;
import com.xworkz.expiry.dao.impl.ExpiredProductDetailDAOimpl;
import com.xworkz.expiry.dto.ExpiredProductDetailDTO;
import com.xworkz.expiry.service.ExpiredProductDetailService;
import com.xworkz.expiry.service.ExpiredProductDetailServiceImpl;

public class runner {

    public static void main(String[] args) {

        ExpiredProductDAO expiredProductDAO = new ExpiredProductDetailDAOimpl();

        ExpiredProductDetailService expiredProductDetailService = new ExpiredProductDetailServiceImpl(expiredProductDAO);
        ExpiredProductDetailDTO expiredProductDetailDTO = new ExpiredProductDetailDTO(201, "Milk Packet", "10-05-2026", 35.0, "Nandini");
        expiredProductDetailService.validateAndSave(expiredProductDetailDTO);
    }
}
