package com.xworkz.battery;

public class BatteryRunner {
    public static void main(String[] args) {

        Battery b1 = new Battery("Duracell", "Alkaline", 1.5);
        Battery b2 = new Battery("Duracell", "Alkaline", 1.5);
        Battery b3 = new Battery("Energizer", "Lithium", 9.0);

        boolean check1 = b1.equals(b2);
        boolean check2 = b1.equals(b3);

        System.out.println("Is b1 and b2 are same ?: " + check1);
        System.out.println("Is b1 and b3 are same? : " + check2);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
