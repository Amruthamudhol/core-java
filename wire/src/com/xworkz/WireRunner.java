package com.xworkz;

public class WireRunner {
    public static void main(String[] args) {
        Wire wire1 = new Wire("Copper", 10.5, 120);
        Wire wire2 = new Wire("Copper", 10.5, 120);
        Wire wire3 = new Wire("Aluminum", 5.0, 800);


        System.out.println(wire1);
        System.out.println(wire2);
        System.out.println(wire3);

        boolean check=wire1.equals(wire2);
        System.out.println("wire1 and wire2 are equal?:"+check);

        boolean checker = wire1.equals(wire3);
        System.out.println("wire1 and wire3 are equal?:"+checker);


    }
}
