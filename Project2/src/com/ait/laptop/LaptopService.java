package com.ait.laptop;

public class LaptopService {
    String brand;
    int batteryBackup;
    double weight;
    boolean isTouchScreen;

    void displayLaptop() {
        System.out.println("Brand: " + brand);
        System.out.println("Battery Backup: " + batteryBackup );
        System.out.println("Weight: " + weight );
        System.out.println("Touch Screen: " + isTouchScreen);
    }

    public static void main(String[] args) {

        LaptopService laptop = new LaptopService();

        laptop.brand = "Lenovo";
        laptop.batteryBackup = 10;
        laptop.weight = 1.8;
        laptop.isTouchScreen = false;

        laptop.displayLaptop();
    }
}

