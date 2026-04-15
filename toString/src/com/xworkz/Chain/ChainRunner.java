package com.xworkz.Chain;

import java.util.Arrays;

public class ChainRunner {
    public static void main(String[] args) {

        Vendor v1 = new Vendor("MetalWorks", 5);

        String[] patterns = {"Classic", "Modern"};


        Chain ch1 = new Chain(1001L, 2.5f,
                patterns, MetalType.COPPER, v1);

        DesignerChain ch2 = new DesignerChain(2002L, 3.0f,
                patterns, MetalType.TITANIUM, v1,
                "RoyalStyle", true);

        ch1.displayChain();
        ch1.showThickness();
        System.out.println(ch1);

        System.out.println("Patterns: " + Arrays.toString(patterns));

        System.out.println("----------------------");

        ch2.displayChain();
        ch2.showThickness();
        System.out.println(ch2);

        System.out.println("Patterns: " + Arrays.toString(patterns));
    }
}
