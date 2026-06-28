package com.xworkz.collection.dto;

import lombok.*;

import java.time.LocalDate;
@NoArgsConstructor
@ToString
@Getter
@Setter
@AllArgsConstructor
public class OrderDTO {
    private String orderId;
    private String customerId;
    private LocalDate orderDate;
    private String status;
    private double totalAmount;
}
