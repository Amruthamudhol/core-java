package com.xworkz.collection.dto;

import lombok.*;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class InventoryDTO {
    private String itemId;
    private String productName;
    private int quantity;
    private String location;
    private String supplier;
}
