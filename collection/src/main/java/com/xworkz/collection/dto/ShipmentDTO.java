package com.xworkz.collection.dto;

import lombok.*;

import java.time.LocalDate;

@ToString
@Setter
@NoArgsConstructor
@Getter
@AllArgsConstructor

public class ShipmentDTO {
    private int shipmentId;
    private int orderId;
    private String carrier;
    private String trackingNumber;
    private LocalDate deliveryDate;
}
