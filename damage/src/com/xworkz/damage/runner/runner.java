package com.xworkz.damage.runner;

import com.xworkz.damage.dao.DamagedProductDetailDAO;
import com.xworkz.damage.dao.impl.DamagedProductDetailDAOimpl;
import com.xworkz.damage.dto.DamagedProductDetailDTO;
import com.xworkz.damage.service.DamagedProductDetailService;
import com.xworkz.damage.service.DamagedProductDetailServiceImpl;

public class runner {

    public static void main(String[] args) {
        DamagedProductDetailDAO damagedProductDetailDAO= new DamagedProductDetailDAOimpl();
        DamagedProductDetailService damagedProductDetailService = new DamagedProductDetailServiceImpl(damagedProductDetailDAO);

        DamagedProductDetailDTO damagedProductDetailDTO =new DamagedProductDetailDTO(301, "curd Packet", "Package Tear", 45.0, "Banglore Warehouse");
        damagedProductDetailService.validateAndSave(damagedProductDetailDTO);
    }
}
