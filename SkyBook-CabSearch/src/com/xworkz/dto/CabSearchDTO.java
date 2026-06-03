package com.xworkz.dto;

import com.xworkz.constant.TripType;
import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Setter
@AllArgsConstructor

public class CabSearchDTO {
    private TripType tripType;
    private String from;
    private String to;
    private LocalDate pickupDate;
    private String pickupTime;
}
