package com.xworkz.dao;

import com.xworkz.dao.CabDAO;
import com.xworkz.dto.CabSearchDTO;

public class CabDAOImpl implements CabDAO {
    @Override
    public boolean search(CabSearchDTO dto) {

        System.out.println("Cab Search Details");
        System.out.println("Trip Type : " + dto.getTripType());
        System.out.println("From : " + dto.getFrom());
        System.out.println("To : " + dto.getTo());
        System.out.println("Pickup Date : " + dto.getPickupDate());
        System.out.println("Pickup Time : " + dto.getPickupTime());

        return true;
    }
}
