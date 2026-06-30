package com.xworkz.watch.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode

public class SmartWatchDTO implements Serializable {
    private int watchId;
    private String brand;
    private String modelName;
    private double displaySize;
    private int batteryCapacity;
    private boolean gpsEnabled;
    private boolean waterResistant;
    private double price;
    private LocalDate launchDate;
    private String operatingSystem;


}
