package com.xworkz.Actor;

public class Agency {
    String agencyName;
    String city;

    Agency(String agencyName, String city) {
        this.agencyName = agencyName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Agency [agencyName=" + agencyName + ", city=" + city + "]";
    }

}
