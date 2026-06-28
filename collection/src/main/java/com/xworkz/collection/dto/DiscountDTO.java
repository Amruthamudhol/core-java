package com.xworkz.collection.dto;

import lombok.*;

import java.time.LocalDate;
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class DiscountDTO {
    private int discountId;
    private String code;
    private String description;
    private double percentage;
    private LocalDate expiryDate;
}
