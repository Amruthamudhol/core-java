package com.xworkz.collection.runner;

import com.xworkz.collection.dto.CategoryDTO;

import java.util.Collection;
import java.util.HashSet;

public class CategoryRunner {
    public static void main(String[] args) {

        Collection<CategoryDTO> categoryDTOs = new HashSet<>();

        categoryDTOs.add(new CategoryDTO(1, "Electronics", "Electronic Items", 0, "Active"));
        categoryDTOs.add(new CategoryDTO(2, "Mobiles", "Smartphones", 1, "Active"));
        categoryDTOs.add(new CategoryDTO(3, "Laptops", "Portable Computers", 1, "Active"));
        categoryDTOs.add(new CategoryDTO(4, "Accessories", "Mobile Accessories", 2, "Inactive"));
        categoryDTOs.add(new CategoryDTO(5, "Home Appliances", "Home Use Products", 0, "Active"));

        System.out.println(categoryDTOs);
    }
}
