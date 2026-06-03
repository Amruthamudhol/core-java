package com.xworkz.dto;

import com.xworkz.constant.FlightStatusType;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@NoArgsConstructor
@Getter
@ToString


public class FlightStatusDTO {
    private FlightStatusType statusType;
    private String pnr;
    private String flightNumber;
    private LocalDate travelDate;


}
