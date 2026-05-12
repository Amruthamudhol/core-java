package com.xworkz.bluetooth;

public class Runner {
    public static void main(String[] args) {

        Bluetooth bluetooth = new Impl();

        Device device = new Device(bluetooth);

        device.useDevice();
    }
}
