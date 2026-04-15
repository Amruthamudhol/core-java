package com.xworkz.slipper;

public class SlipperRunner {
    public static void main(String[] args) {

        Company comp = new Company("Nike", "USA");

        String[] shades = {"Red", "White"};

        Slipper obj1 = new Slipper("ComfortFit", 7, 599.0,
                shades, Category.HOME, comp);

        PremiumSlipper obj2 = new PremiumSlipper("ProRun", 9, 1299.0,
                shades, Category.ATHLETIC, comp,
                "Leather", 2);

        obj1.useItem();
        obj1.showCost();
        System.out.println(obj1);

        System.out.println("----------------------");

        obj2.useItem();
        obj2.showCost();
        System.out.println(obj2);
    }
}
