package com.xworkz.management.main;

public class City {
    public String name;
    public int noOfDistricts;
    public District[] districts;

    public City(String name, int noOfDistricts, District[] districts) {
        this.name = name;
        this.noOfDistricts = noOfDistricts;
        this.districts = districts;
    }
}
