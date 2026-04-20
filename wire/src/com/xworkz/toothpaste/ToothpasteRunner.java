package com.xworkz.toothpaste;

public class ToothpasteRunner {
    public static void main(String[] args) {

        Toothpaste t1 = new Toothpaste("Colgate", "Mint", 100.0);
        Toothpaste t2 = new Toothpaste("Colgate", "Mint", 100.0);
        Toothpaste t3 = new Toothpaste("Pepsodent", "Herbal", 75.0);

        boolean check1 = t1.equals(t2);
        boolean check2 = t1.equals(t3);

        System.out.println("t1 is equals to t1? :"+check1);
        System.out.println("t1 is equal to t3? :"+check2);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
