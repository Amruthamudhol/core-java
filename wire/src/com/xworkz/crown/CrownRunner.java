package com.xworkz.crown;

public class CrownRunner {
    public static void main(String[] args) {

        Crown c1 = new Crown("Gold", "Yellow", 12);
        Crown c2 = new Crown("Gold", "Yellow", 12);
        Crown c3 = new Crown("Silver", "White", 8);

        boolean check1 = c1.equals(c2);
        boolean check2 = c1.equals(c3);

        System.out.println(check1);
        System.out.println(check2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
