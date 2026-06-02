package com.xworkz.dto;

import java.time.LocalDate;
import java.util.Currency;
import com.xworkz.constants.TripType;
import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor
public class PlaneSearchDTO {
    private TripType tripType;
    private Currency currency;

    private String from;
    private String to;

    private LocalDate departureDate;
    private LocalDate returnDate;

    private int passengers;


}
