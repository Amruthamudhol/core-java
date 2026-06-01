package com.xworkz.order.service;

import com.xworkz.order.dto.OrderDetailDTO;

public class OrderDetailServiceImpl implements OrderDetailService{
    @Override

    public boolean validateAndSave(OrderDetailDTO dto) {
        System.out.println("Order details are :" + dto);

        String customerName = dto.getCustomerName();
        if (customerName != null && customerName.length() >= 3 && customerName.length() <= 100 && customerName.matches("[a-zA-Z ]+"))
        {
            System.out.println("valid Customer Name");
        }
        else {
            System.err.println("invalid Customer Name");
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

        double price = dto.getPrice();
        if (price > 0) {
            System.out.println("Valid Price");
        }
        else {
            System.err.println("invalid Price");
            return false;
        }

        int quantity = dto.getQuantity();
        if (quantity > 0) {
            System.out.println("valid Quantity");
        } else {
            System.err.println("invalid Quantity");
            return false;
        }

        return true;
    }
}
