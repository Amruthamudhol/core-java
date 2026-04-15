package com.xworkz.Plate;

import java.util.Arrays;

public class PlateRunner {
    public static void main(String[] args) {

        Factory f1 = new Factory("KitchenPro", "Karnataka");

        String[] styles = {"Striped", "Plain"};

        Plate p1 = new Plate(1001L, 2.5f,
                styles, UsageType.HOME, f1);

        PremiumPlate p2 = new PremiumPlate(2002L, 3.2f,
                styles, UsageType.HOTEL, f1,
                5, true);

        p1.serveFood();
        p1.showThickness();
        System.out.println(p1);

        System.out.println("Styles: " + Arrays.toString(styles));

        System.out.println("----------------------");

        p2.serveFood();
        p2.showThickness();
        System.out.println(p2);

        System.out.println("Styles: " + Arrays.toString(styles));
    }
}
