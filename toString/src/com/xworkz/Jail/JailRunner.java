package com.xworkz.Jail;

import java.util.Arrays;

public class JailRunner {
    public static void main(String[] args) {

        Department d1 = new Department("Prison Dept", true);

        String[] blocks = {"A Block", "B Block"};

        Jail j1 = new Jail(10001L, 5000.5,
                blocks, ZoneType.SOUTH, d1);


        HighSecurityUnit j2 = new HighSecurityUnit(20002L, 3000.0,
                blocks, ZoneType.NORTH, d1,
                'A', 150);

        j1.monitor();
        j1.showArea();
        System.out.println(j1);

        System.out.println("Blocks: " + Arrays.toString(blocks));

        System.out.println("----------------------");

        j2.monitor();
        j2.showArea();
        System.out.println(j2);

        System.out.println("Blocks: " + Arrays.toString(blocks));
    }
}
