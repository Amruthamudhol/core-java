package com.xworkz.Belt;

import java.util.Arrays;

public class BeltRunner {
    public static void main(String[] args) {

        BrandInfo b1 = new BrandInfo("Levis", "USA");

        String[] colors = {"Black", "Brown"};

        Belt bObj1 = new Belt(101, 40.5,
                colors, BeltType.FORMAL, b1);

        LeatherBelt bObj2 = new LeatherBelt(202, 42.0,
                colors, BeltType.CASUAL, b1,
                "Genuine", true);

        bObj1.wearBelt();
        bObj1.showLength();
        System.out.println(bObj1);

        System.out.println("Colors: " + Arrays.toString(colors));

        System.out.println("----------------------");

        bObj2.wearBelt();
        bObj2.showLength();
        System.out.println(bObj2);

        System.out.println("Colors: " + Arrays.toString(colors));
    }
}