package com.xworkz.expiry.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Setter

public class ExpiredProductDetailDTO implements Serializable {

    private int productId;
    private String productName;
    private String expiryDate;
    private double price;
    private String companyName;
}
