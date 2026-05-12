package com.xworkz.bluetooth;

public class Device {
    Bluetooth bluetooth;
    Device(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void useDevice() {
        System.out.println("Device is using Bluetooth");

        if (bluetooth != null) {
            bluetooth.connect();
            bluetooth.disConnect();
        }
    }
}
