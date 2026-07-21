package com.xworkz.map.dto;


import lombok.*;

@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
@AllArgsConstructor
public class StudentDTO {
    private int studentId;
    private String studentName;
    private String course;
}
