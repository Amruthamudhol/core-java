package com.xworkz.order.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class OrderDetailDTO {




    private int orderId;
    private String customerName;
    private String productName;
    private double price;
    private int quantity;

    public OrderDetailDTO(int orderId, String customerName, String productName, double price, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;


    }

    @Override
    public String toString() {
        return "OrderDetailDTO{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
