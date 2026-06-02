package com.xworkz.sales.service;

import com.xworkz.sales.dao.SalesDetailDAO;
import com.xworkz.sales.dto.SalesDetailDTO;

public class SalesDetailServiceImpl implements SalesDetailService {
    private SalesDetailDAO salesDetailDAO;
    public SalesDetailServiceImpl(SalesDetailDAO salesDetailDAO){
    this.salesDetailDAO=salesDetailDAO;
    }

    @Override
    public boolean validateAndSave(SalesDetailDTO dto) {

        System.out.println("Saving details : " + dto);

        int salesNumber = dto.getSalesNumber();
        if (salesNumber > 0) {
            System.out.println("Valid Sales Number");
        } else {
            System.err.println("Invalid Sales Number");
            return false;
        }

        String itemName = dto.getItemName();
        if (itemName != null && itemName.length() >= 3 && itemName.length() <= 100 && itemName.matches("[a-zA-Z ]+")) {

            System.out.println("Valid Item Name");
        } else {
            System.err.println("Invalid Item Name");
            return false;
        }

        double totalAmount = dto.getTotalAmount();
        if (totalAmount > 0) {
            System.out.println("valid Total Amount");
        }
        else {
            System.err.println("invalid Total Amount");
            return false;
        }


        String salesDate = dto.getSalesDate();
        if (salesDate != null) {
            System.out.println("Valid Sales Date");
        } else {
            System.err.println("Invalid Sales Date");
            return false;
        }

        String paymentMode = dto.getPaymentMode();
        if (paymentMode != null && paymentMode.length() >= 3 && paymentMode.length() <= 20 && paymentMode.matches("[a-zA-Z ]+")) {
            System.out.println("valid Payment Mode");
        } else {
            System.err.println("invalid Payment Mode");
            return false;
        }

        System.out.println("all validations are complete");
        if(this.salesDetailDAO!=null){
            System.out.println("salesDetailDAO is not null, will save it");
            this.salesDetailDAO.save(salesDetailDAO);

        }

        return  true;
    }
}