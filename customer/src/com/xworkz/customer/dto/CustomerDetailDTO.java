package com.xworkz.customer.dto;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDetailDTO implements Serializable {

    private int customerId;
    private String customerName;
    private String email;
    private long mobileNumber;
    private String address;
}
