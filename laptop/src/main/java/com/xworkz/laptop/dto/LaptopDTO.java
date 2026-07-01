package com.xworkz.laptop.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;


@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
@AllArgsConstructor
public class LaptopDTO implements Serializable {
    private String brand;
    private String model;
    private String processor;
    private int ram;
    private int storage;
    private double screenSize;
    private String operatingSystem;
    private double price;
    private boolean touchscreen;
    private LocalDate releaseDate;
}
