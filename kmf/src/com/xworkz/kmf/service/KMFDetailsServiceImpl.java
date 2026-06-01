package com.xworkz.kmf.service;

import com.xworkz.kmf.dto.KMFDetailsDTO;

public class KMFDetailsServiceImpl implements KMFDetailsService{
    @Override
    public boolean validateAndSave(KMFDetailsDTO dto) {
        System.out.println("KMF Details are :" + dto);

        int kmfId = dto.getKmfId();
        if (kmfId > 0)
        {
            System.out.println("valid KMF Id");
        } else {
            System.err.println("invalid KMF Id");
            return false;
        }

        String dairyName = dto.getDairyName();
        if (dairyName != null && dairyName.length() >= 3 && dairyName.length() <= 100 && dairyName.matches("[a-zA-Z ]+"))
        {
            System.out.println("valid dairy Name");
        } else {
            System.err.println("Invalid dairy Name");
            return false;
        }

        String location = dto.getLocation();
        if (location != null && location.length() >= 3 && location.length() <= 100 && location.matches("[a-zA-Z ]+")) {
            System.out.println("Valid location");
        }
        else {
            System.err.println("invalid location");
            return false;
        }

        double milkQuantity = dto.getMilkQuantity();
        if (milkQuantity > 0)
        {System.out.println("Valid Milk Quantity");
        }
        else {
            System.err.println("invalid Milk Quantity");
            return false;
        }

        String managerName = dto.getManagerName();
        if (managerName != null && managerName.length() >= 3 && managerName.length() <= 100 && managerName.matches("[a-zA-Z ]+"))
        {
            System.out.println("valid Manager Name");
        }
        else {
            System.err.println("invalid Manager Name");
            return false;
        }

        System.out.println(" KMF Details are Valid");
        return true;
    }
}
