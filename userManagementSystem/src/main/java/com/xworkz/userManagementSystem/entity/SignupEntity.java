package com.xworkz.userManagementSystem.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "signup")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "userid")
    private String userId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "confirmpassword")
    private String confirmPassword;
}