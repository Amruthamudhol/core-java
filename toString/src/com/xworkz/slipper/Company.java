package com.xworkz.slipper;

public class Company {
    String companyTitle;
    String origin;

    Company(String companyTitle, String origin) {
        this.companyTitle = companyTitle;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Company [companyTitle=" + companyTitle + ", origin=" + origin + "]";
    }
}
