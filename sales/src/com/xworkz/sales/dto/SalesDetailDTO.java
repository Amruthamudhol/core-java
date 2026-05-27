package com.xworkz.sales.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


public class SalesDetailDTO implements Serializable {

    @Getter
    @Setter
    private int salesNumber;
    private String itemName;
    private double totalAmount;
    private String salesDate;
    private String paymentMode;

    public SalesDetailDTO(int salesNumber, String itemName, double totalAmount, String salesDate, String paymentMode) {
        this.salesNumber = salesNumber;
        this.itemName = itemName;
        this.totalAmount = totalAmount;
        this.salesDate = salesDate;
        this.paymentMode = paymentMode;
    }

    @Override
    public String toString() {
        return "SalesDetailDTO{" +
                "salesNumber=" + salesNumber +
                ", itemName='" + itemName + '\'' +
                ", totalAmount=" + totalAmount +
                ", salesDate='" + salesDate + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                '}';
    }
}
