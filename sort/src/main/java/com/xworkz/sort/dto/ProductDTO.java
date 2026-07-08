package com.xworkz.sort.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class ProductDTO implements Serializable,Comparable<ProductDTO> {
    private int id;
    private String name;
    private String brand;
    private double price;
    private int quantity;

    @Override
    public int compareTo(ProductDTO o) {
        ProductDTO left = this;
        ProductDTO right = o;

        if (left.id == right.id)
            return 0;
        else if (left.id > right.id)
            return 100;
        else
            return -100;
    }




}
