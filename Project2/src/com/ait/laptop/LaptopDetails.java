package com.ait.laptop;

public class LaptopDetails {
    String brand;
    String processor;
    int ram;
    double price;

    public LaptopDetails(String brand, String processor, int ram, double price) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.price = price;
    }

    public void  printDetails(){
        System.out.println("brand:"+this.brand);
        System.out.println("processor:"+this.processor);
        System.out.println("ram:"+this.ram);
        System.out.println("price:"+this.price);
    }
}
