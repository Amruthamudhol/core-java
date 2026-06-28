package com.xworkz.collection.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@NoArgsConstructor
@Getter
@AllArgsConstructor

public class CategoryDTO implements Serializable {
    private int categoryId;
    private String name;
    private String description;
    private int parentId;
    private String status;
}
