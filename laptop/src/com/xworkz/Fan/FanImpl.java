package com.xworkz.Fan;

public class FanImpl implements Fan {
    public void switchOn() {
        System.out.println("Fan switched on");
    }

    public void rotate() {
        System.out.println("Fan is rotating");
    }

    public void switchOff() {
        System.out.println("Fan switched off");
    }

}
