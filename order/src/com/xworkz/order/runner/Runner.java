package com.xworkz.order.runner;

import com.xworkz.order.dto.OrderDetailDTO;
import com.xworkz.order.service.OrderDetailService;
import com.xworkz.order.service.OrderDetailServiceImpl;

public class Runner {
    public static void main(String[] args) {

        OrderDetailService orderDetailService = new OrderDetailServiceImpl();

        OrderDetailDTO orderDetailDTO = new OrderDetailDTO(101, "Amruta", "Laptop", 55000.0, 2);

        orderDetailService.validateAndSave(orderDetailDTO);
    }
}
