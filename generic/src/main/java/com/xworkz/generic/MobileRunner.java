package com.xworkz.generic;

public class MobileRunner {
    public static void main(String[] args) {

        Mobile<String, Integer> mobile = new Mobile<>();
        mobile.brand = "Samsung";
        mobile.price = 25000;

        System.out.println(mobile.brand);
        System.out.println(mobile.price);

        Mobile<String, Double> mobile1 = new Mobile<>();
        mobile1.brand = "iPhone";
        mobile1.price = 70000.0;

        System.out.println(mobile1.brand);
        System.out.println(mobile1.price);
    }
}
