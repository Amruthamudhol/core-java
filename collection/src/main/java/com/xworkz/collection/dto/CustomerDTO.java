package com.xworkz.collection.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO {

    private String id;
    private String name;
    private String email;
    private long phone;
    private String address;
}
