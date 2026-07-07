package com.xworkz.stream.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@ToString
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor

public class WarDTO implements Serializable {
    private String warName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private List<String> countriesInvolved;
    private int casualties;
    private String outcome;
    private int durationDays;
    private String commander;
    private String reason;
}
