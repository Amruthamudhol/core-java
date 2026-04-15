package com.xworkz.Room;

import java.util.Arrays;

public class RoomRunner {
    public static void main(String[] args) {

        Building b1 = new Building("SkyTower", 10);

        String[] fac = {"WiFi", "AC"};

        Room r1 = new Room(101, 5000.0f,
                fac, RoomType.SINGLE, b1);

        LuxuryRoom r2 = new LuxuryRoom(202, 10000.0f,
                fac, RoomType.SUITE, b1,
                true, 1500.0);

        r1.bookRoom();
        r1.showRent();
        System.out.println(r1);

        System.out.println("Facilities: " + Arrays.toString(fac));

        System.out.println("----------------------");

        r2.bookRoom();
        r2.showRent();
        System.out.println(r2);

        System.out.println("Facilities: " + Arrays.toString(fac));
    }
}
