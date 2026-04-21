package com.xworkz.fork;

public class ForkRunner {
    public static void main(String[] args) {

        Fork f1 = new Fork("Steel", "Dinner", 4);
        Fork f2 = new Fork("Steel", "Dinner", 4);
        Fork f3 = new Fork("Plastic", "Salad", 3);

        boolean check1 = f1.equals(f2);
        boolean check2 = f1.equals(f3);

        System.out.println("Is f1 and f2 are same ?: " + check1);
        System.out.println("Is f1 and f3 are same? : " + check2);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
