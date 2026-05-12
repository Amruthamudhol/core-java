package com.xworkz.bluetooth;

public class Impl implements Bluetooth{
    @Override
    public void connect() {
        System.out.println("Bluetooth is connected");
    }

    @Override
    public void disConnect() {
        System.out.println("Bluetooth is disconnected");
    }

}
