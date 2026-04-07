package com.xworkz.bank.Product;

public class PanCard {
    String panId;
    String applicantName;
    String parentName;
    String birthDate;
    String city;


    public PanCard(String panId, String applicantName, String parentName, String birthDate, String city) {
        this.panId = panId;
        this.applicantName = applicantName;
        this.parentName = parentName;
        this.birthDate = birthDate;
        this.city = city;
    }


    void info() {
        System.out.println("PAN Id        : " + panId);
        System.out.println("ApplicantName : " + applicantName);
        System.out.println("Parent Name   : " + parentName);
        System.out.println("Birth Date    : " + birthDate);
        System.out.println("City          : " + city);
    }
}
