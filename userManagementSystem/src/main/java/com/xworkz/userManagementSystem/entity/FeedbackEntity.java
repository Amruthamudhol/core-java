package com.xworkz.userManagementSystem.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class FeedbackEntity {
    private String name;
    private String email;
    private String mobile;
    private String comment;
}
