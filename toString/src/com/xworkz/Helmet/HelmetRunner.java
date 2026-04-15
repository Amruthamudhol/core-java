package com.xworkz.Helmet;

public class HelmetRunner {
    public static void main(String[] args) {

        Supplier s1 = new Supplier(10101L, "Bangalore");

        String[] tags = {"Shockproof", "Lightweight"};

        Helmet h1 = new Helmet(5001, 1.2, true,
                'M', tags, ProtectionGrade.STANDARD, s1);

        RacingHelmet h2 = new RacingHelmet(7001, 1.0, true,
                'L', tags, ProtectionGrade.PREMIUM, s1,
                300, true);

        h1.checkSafety();
        h1.displayWeight();
        System.out.println(h1);

        System.out.println("----------------------");

        h2.checkSafety();
        h2.displayWeight();
        System.out.println(h2);
    }
}
