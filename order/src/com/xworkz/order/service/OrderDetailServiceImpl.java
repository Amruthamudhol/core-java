package com.xworkz.order.service;

import com.xworkz.order.dto.OrderDetailDTO;

public class OrderDetailServiceImpl implements OrderDetailService{
    @Override

    public boolean validateAndSave(OrderDetailDTO dto) {
        System.out.println("Order details are :" + dto);
        return false;
    }
}
