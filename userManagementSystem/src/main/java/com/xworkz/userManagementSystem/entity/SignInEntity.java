package com.xworkz.userManagementSystem.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "signin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignInEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "userid")
    private String userId;

    @Column(name = "password")
    private String password;
}