package com.xworkz.userManagementSystem.dto;


import lombok.ToString;

import java.io.Serializable;


@ToString
public class FeedbackDTO implements Serializable {
    private String name;
    private String email;
    private String mobile;
    private String comment;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public FeedbackDTO(String name, String email, String mobile, String comment) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.comment = comment;
    }
}
