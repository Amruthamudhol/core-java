package com.xworkz.runner;

import com.xworkz.sales.dto.SalesDetailDTO;
import com.xworkz.sales.service.SalesDetailService;
import com.xworkz.sales.service.SalesDetailServiceImpl;

public class runner {

    public static void main(String[] args) {

        SalesDetailService service = new SalesDetailServiceImpl();

        SalesDetailDTO dto = new SalesDetailDTO(101, "Milk Packet", 250.0, "26-5-26", "UPI");

        service.validateAndSave(dto);
    }
}
