package com.xworkz.kmf.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class KMFDetailsDTO implements Serializable {

    private int kmfId;
    private String dairyName;
    private String location;
    private double milkQuantity;
    private String managerName;
}
