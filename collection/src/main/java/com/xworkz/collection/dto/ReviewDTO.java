package com.xworkz.collection.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class ReviewDTO {
    private int reviewId;
    private int productId;
    private int customerId;
    private double rating;
    private String comment;
}
