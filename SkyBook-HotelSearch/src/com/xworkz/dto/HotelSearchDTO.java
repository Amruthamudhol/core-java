package com.xworkz.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode

public class HotelSearchDTO {
    private String destination;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int adults;
    private int rooms;
    private String pnr;

}
