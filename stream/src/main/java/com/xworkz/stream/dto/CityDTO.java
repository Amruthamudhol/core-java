package com.xworkz.stream.dto;


import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
@ToString
public class CityDTO implements Serializable {

    private String cityName;
    private int pincode;
}
