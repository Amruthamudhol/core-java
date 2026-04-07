package com.xworkz.bank.Product;

public class ToyRunner {
    public static void main(String[] args) {

        ToyOperations store = new ToyOperations();

        Toy t1 = new Toy(1, "Car", "HotWheels", 250, "Red");
        store.addToy(t1);

        Toy t2 = new Toy(2, "Doll", "Barbie", 500, "Pink");
        store.addToy(t2);

        Toy t3 = new Toy(3, "Robot", "FunCorp", 1200, "Blue");
        store.addToy(t3);

        store.getToyDetailsById(2);

        store.updatePriceAndColor("Car", 300, "Black");
    }
}
