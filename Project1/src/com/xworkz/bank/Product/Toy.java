package com.xworkz.bank.Product;

public class Toy {
    int toyId;
    String toyName;
    String brand;
    double price;
    String color;

    public Toy(int toyId, String toyName, String brand, double price, String color) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void info(){
        System.out.println("Toy Id:"+this.toyId);
        System.out.println("Toy Name:"+this.toyName);
        System.out.println("Toy Brand:"+this.brand);
        System.out.println("Toy Price:"+this.price);
        System.out.println("Toy color:"+this.color);
    }
}
