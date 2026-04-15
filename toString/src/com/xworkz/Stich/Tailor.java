package com.xworkz.Stich;

public class Tailor {
    String tailorName;
    int experienceYears;

    Tailor(String tailorName, int experienceYears) {
        this.tailorName = tailorName;
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Tailor [tailorName=" + tailorName +
                ", experienceYears=" + experienceYears + "]";
    }
}
