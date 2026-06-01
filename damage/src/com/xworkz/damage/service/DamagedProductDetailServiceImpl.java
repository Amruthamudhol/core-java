package com.xworkz.damage.service;

import com.xworkz.damage.dto.DamagedProductDetailDTO;

public class DamagedProductDetailServiceImpl implements DamagedProductDetailService{
    @Override
    public boolean validateAndSave(DamagedProductDetailDTO dto) {
        System.out.println("Damaged Product Details are :" + dto);

        int productId = dto.getProductId();
        if (productId > 0) {System.out.println("Valid Product Id");
        }
        else {
            System.err.println("Invalid Product Id");
            return false;
        }

        String productName = dto.getProductName();
        if (productName != null && productName.length() >= 3 && productName.length() <= 100 && productName.matches("[a-zA-Z ]+"))
        {
            System.out.println("Valid Product Name");
        } else {
            System.err.println("Invalid Product Name");
            return false;
        }

        String damageType = dto.getDamageType();
        if (damageType != null && damageType.length() >= 3 && damageType.length() <= 50 && damageType.matches("[a-zA-Z ]+")) {

            System.out.println("Valid Damage Type");
        }
        else {
            System.err.println("Invalid Damage Type");
            return false;
        }

        double productPrice = dto.getProductPrice();
        if (productPrice > 0) {
            System.out.println("Valid Product Price");
        }
        else {
            System.err.println("Invalid Product Price");
            return false;
        }


        String warehouseLocation = dto.getWarehouseLocation();
        if (warehouseLocation != null && warehouseLocation.length() >= 3 && warehouseLocation.length() <= 100 && warehouseLocation.matches("[a-zA-Z ]+")) {
            System.out.println("Valid Warehouse Location");
        } else {
            System.err.println("Invalid Warehouse Location");
            return false;
        }
        return true;
    }
}
