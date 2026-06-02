package com.xworkz.runner;

import com.xworkz.sales.dao.SalesDetailDAO;
import com.xworkz.sales.dao.impl.SalesDetailDAOimpl;
import com.xworkz.sales.dto.SalesDetailDTO;
import com.xworkz.sales.service.SalesDetailService;
import com.xworkz.sales.service.SalesDetailServiceImpl;

public class runner {

    public static void main(String[] args) {

        SalesDetailDAO salesDetailDAO= new SalesDetailDAOimpl();

        SalesDetailService service = new SalesDetailServiceImpl(salesDetailDAO);

        SalesDetailDTO dto = new SalesDetailDTO(101, "Milk Packet", 250.0, "26-5-26", "UPI");

        service.validateAndSave(dto);
    }
}
