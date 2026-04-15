package com.xworkz.language;

public class Developer {
    String devName;
    String countryOrigin;

    Developer(String devName, String countryOrigin) {
        this.devName = devName;
        this.countryOrigin = countryOrigin;
    }

    @Override
    public String toString() {
        return "Developer [devName=" + devName + ", countryOrigin=" + countryOrigin + "]";
    }
}
