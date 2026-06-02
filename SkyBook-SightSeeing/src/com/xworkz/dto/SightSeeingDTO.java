package com.xworkz.dto;

import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter

public class SightSeeingDTO {
    private String placeName;
    private LocalDate tripDate;
}
