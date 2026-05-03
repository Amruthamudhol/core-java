package com.xworkz.Laptop;

public class LaptopImpl implements Laptop{
    public void powerOn() {
        System.out.println("Laptop is powering on");
    }

    public void runProgram() {
        System.out.println("Laptop is running");
    }

    public void shutdown() {
        System.out.println("Laptop is shutting down");
    }
}
