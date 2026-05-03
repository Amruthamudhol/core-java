package com.xworkz.Fan;

public class FanRunner {
    public static void main(String[] args) {
        FanImpl fan = new FanImpl();

        fan.switchOn();
        fan.rotate();
        fan.switchOff();

        System.out.println(Fan.company);
        System.out.println(Fan.blades);
    }
}
