package com.xworkz.Stich;

import java.util.Arrays;

public class StitchRunner {
    public static void main(String[] args) {

        Tailor t1 = new Tailor("Ravi", 10);

        String[] fabrics = {"Cotton", "Silk"};

        Stitch s1 = new Stitch(1, 500.0,
                fabrics, StitchType.HAND, t1);

        DesignerStitch s2 = new DesignerStitch(2, 1200.0,
                fabrics, StitchType.EMBROIDERY, t1,
                "WeddingDesign", true);

        s1.startStitch();
        s1.showCost();
        System.out.println(s1);

        System.out.println("Fabrics: " + Arrays.toString(fabrics));

        System.out.println("----------------------");

        s2.startStitch();
        s2.showCost();
        System.out.println(s2);

        System.out.println("Fabrics: " + Arrays.toString(fabrics));
    }
}
