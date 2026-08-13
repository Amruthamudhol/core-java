package com.xworkz.userManagementSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class FeedbackDTO implements Serializable {
    private String name;
    private String email;
    private String mobile;
    private String comment;


}
