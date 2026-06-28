package com.xworkz.collection.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
public class EmployeeDTO {
    private String employeeId;
    private String name;
    private String department;
    private String designation;
    private double salary;
}
