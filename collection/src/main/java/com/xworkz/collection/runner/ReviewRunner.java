package com.xworkz.collection.runner;

import com.xworkz.collection.dto.ReviewDTO;

import java.util.LinkedList;
import java.util.List;

public class ReviewRunner {
    public static void main(String[] args) {

        ReviewDTO reviewDTO1 = new ReviewDTO(101, 201, 301, 4.5, "Excellent Product");
        ReviewDTO reviewDTO2 = new ReviewDTO(102, 202, 302, 3.8, "Good Quality");
        ReviewDTO reviewDTO3 = new ReviewDTO(103, 203, 303, 5.0, "Highly Recommended");
        ReviewDTO reviewDTO4 = new ReviewDTO(104, 204, 304, 4.2, "Worth Buying");
        ReviewDTO reviewDTO5 = new ReviewDTO(105, 205, 305, 3.5, "Average Product");

        List<ReviewDTO> reviewDTOs = new LinkedList<>();

        reviewDTOs.add(reviewDTO1);
        reviewDTOs.add(reviewDTO2);
        reviewDTOs.add(reviewDTO3);
        reviewDTOs.add(reviewDTO4);
        reviewDTOs.add(reviewDTO5);

        System.out.println("Total Reviews : " + reviewDTOs.size());

        for (ReviewDTO review : reviewDTOs) {
            System.out.println(review);
        }
    }
}
