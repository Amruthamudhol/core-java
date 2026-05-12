package com.xworkz.superMarket;

public class Producer {

    SuperMarket superMarket;

    // Constructor FIXED
    public Producer(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public void sell(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public void producer() {
        System.out.println("Running producer method in Producer");

        if (this.superMarket != null) {
            this.superMarket.purchase();
            this.superMarket.discount();
        } else {
            System.out.println("SuperMarket reference is null");
        }
    }
}