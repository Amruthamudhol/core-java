package com.xworkz.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        LaptopImpl laptop = new LaptopImpl();

        laptop.powerOn();
        laptop.runProgram();
        laptop.shutdown();

        System.out.println(Laptop.brand);
        System.out.println(Laptop.ram);
    }
}
