package com.xworkz.Information;

public class InformationRunner {
    public static void main(String[] args) {

        Source s1 = new Source("Website", 101);

        String[] keys = {"Java", "OOP"};

        Information i1 = new Information(1, "Java Basics",
                keys, InfoType.EDUCATIONAL, s1);

        DigitalInformation i2 = new DigitalInformation(2, "Online Course",
                keys, InfoType.PROFESSIONAL, s1,
                true, 500);

        i1.displayInfo();
        i1.showId();
        System.out.println(i1);

        System.out.println("----------------------");

        i2.displayInfo();
        i2.showId();
        System.out.println(i2);
    }
}
