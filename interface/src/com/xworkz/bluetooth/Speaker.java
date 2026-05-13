package com.xworkz.bluetooth;

public class Speaker implements Bluetooth {
    @Override
    public void connect() {
        System.out.println("Speaker Bluetooth connected");
    }

    @Override
    public void disConnect() {
        System.out.println("Speaker Bluetooth disconnected");
    }
}
