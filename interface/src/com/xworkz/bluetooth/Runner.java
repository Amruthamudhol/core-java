package com.xworkz.bluetooth;

public class Runner {
    public static void main(String[] args) {

        Bluetooth bluetooth = new Impl();
        Device device = new Device(bluetooth);
        device.useDevice();

        Bluetooth bluetooth1 = new Speaker();
        Device device1 = new Device(bluetooth1);
        device1.useDevice();
    }
}
