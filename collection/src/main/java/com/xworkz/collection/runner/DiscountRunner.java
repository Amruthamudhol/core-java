package com.xworkz.collection.runner;

import com.xworkz.collection.dto.DiscountDTO;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DiscountRunner {
    public static void main(String[] args) {

        DiscountDTO discountDTO1 = new DiscountDTO(101, "S10", "10% off", 10.0, LocalDate.of(2026, 7, 31));
        DiscountDTO discountDTO2 = new DiscountDTO(102, "20", "20% off ", 20.0, LocalDate.of(2026, 8, 15));
        DiscountDTO discountDTO3 = new DiscountDTO(103, "NEW", "New Offer", 15.0, LocalDate.of(2026, 9, 1));
        DiscountDTO discountDTO4 = new DiscountDTO(104, "FEST", "Festival Discount", 25.0, LocalDate.of(2026, 10, 10));
        DiscountDTO discountDTO5 = new DiscountDTO(105, "30", "Mega Sale", 30.0, LocalDate.of(2026, 11, 5));

        List<DiscountDTO> discountDTOs = new LinkedList<>();

        discountDTOs.add(discountDTO1);
        discountDTOs.add(discountDTO2);
        discountDTOs.add(discountDTO3);
        discountDTOs.add(discountDTO4);
        discountDTOs.add(discountDTO5);

        System.out.println("Total Discounts : " + discountDTOs.size());

        for (DiscountDTO discount : discountDTOs) {
            System.out.println(discount);
        }
    }
}
