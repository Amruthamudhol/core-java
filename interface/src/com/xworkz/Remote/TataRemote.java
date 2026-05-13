package com.xworkz.remote;

public class TataRemote implements Remote{
    @Override
    public void turnOn() {
        System.out.println("Tata TV is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tata TV is turned off");
    }
}
