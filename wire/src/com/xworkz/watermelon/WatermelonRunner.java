package com.xworkz.watermelon;

public class WatermelonRunner {
    public static void main(String[] args) {

        Watermelon w1 = new Watermelon("Green", 5.5, 120);
        Watermelon w2 = new Watermelon("Green", 5.5, 120);
        Watermelon w3 = new Watermelon("Yellow", 3.2, 80);

        boolean check1 = w1.equals(w2);
        boolean check2 = w1.equals(w3);

        System.out.println(check1);
        System.out.println(check2);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

    }
}
