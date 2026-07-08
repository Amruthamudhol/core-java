package com.xworkz.sort.runner;

import com.xworkz.sort.dto.ProductDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRunner {
    public static void main(String[] args) {

        List<ProductDTO> list = new ArrayList<>();

        list.add(new ProductDTO(103, "Mouse", "HP", 600, 20));
        list.add(new ProductDTO(101, "Laptop", "Dell", 55000, 5));
        list.add(new ProductDTO(105, "Keyboard", "Logitech", 1200, 10));
        list.add(new ProductDTO(102, "Monitor", "Samsung", 9000, 8));
        list.add(new ProductDTO(104, "Speaker", "Boat", 2500, 15));

        Collections.sort(list);

        System.out.println("ProductDTO in ascending order based on id:");
        for (ProductDTO dto : list) {
            System.out.println(dto);
        }
    }
}
