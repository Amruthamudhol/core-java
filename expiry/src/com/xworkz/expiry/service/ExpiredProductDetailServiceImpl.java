package com.xworkz.expiry.service;

import com.xworkz.expiry.dto.ExpiredProductDetailDTO;

public class ExpiredProductDetailServiceImpl implements ExpiredProductDetailService{
    @Override
    public boolean validateAndSave(ExpiredProductDetailDTO dto) {

        System.out.println("Expired Product Details are : " + dto);

        int productId = dto.getProductId();
        if (productId > 0) {
            System.out.println("valid Product Id");
        } else {
            System.err.println("invalid Product Id");
            return false;
        }

        // Product Name Validation
        String productName = dto.getProductName();
        if (productName != null && productName.length() >= 3 && productName.length() <= 100 && productName.matches("[a-zA-Z ]+")) {
            System.out.println("valid Product Name");
        } else {
            System.err.println("invalid product Name");
            return false;
        }

        String expiryDate = dto.getExpiryDate();
        if (expiryDate != null) {
            System.out.println("Valid Expiry Date");
        } else {
            System.err.println("Invalid Expiry Date");
            return false;
        }

        double price = dto.getPrice();
        if (price > 0) {
            System.out.println("valid Price");
        }
        else {
            System.err.println("Invalid Price");
            return false;
        }

        String companyName = dto.getCompanyName();
        if (companyName != null && companyName.length() >= 3 && companyName.length() <= 100 && companyName.matches("[a-zA-Z ]+")) {
            System.out.println("valid Company Name");
        } else {
            System.err.println("invalid Company Name");
            return false;
        }
        return true;
    }
}
