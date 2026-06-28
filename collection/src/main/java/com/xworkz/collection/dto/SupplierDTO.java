package com.xworkz.collection.dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
public class SupplierDTO implements Serializable {
    private int supplierId;
    private String name;
    private String address;
    private String contactPerson;
    private String phone;
}
