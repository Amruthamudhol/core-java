package com.xworkz.diamond;

public class DiamondRunner {
    public static void main(String[] args) {

        Diamond d1 = new Diamond("White", "Round", 2.5);
        Diamond d2 = new Diamond("White", "Round", 2.5);
        Diamond d3 = new Diamond("Blue", "Oval", 2.0);

        boolean check1 = d1.equals(d2);
        boolean check2 = d1.equals(d3);

        System.out.println("is d1 and d2 are same ?:"+check1);
        System.out.println("is d1 and d3 are same? :"+check2);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }
}

