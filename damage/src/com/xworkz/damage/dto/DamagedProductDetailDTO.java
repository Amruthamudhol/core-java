package com.xworkz.damage.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class DamagedProductDetailDTO {

    private int productId;
    private String productName;
    private String damageType;
    private double productPrice;
    private String warehouseLocation;
}
