package com.xworkz.Movie;

public class Producer {
    String producerTitle;
    double budgetAmount;

    Producer(String producerTitle, double budgetAmount) {
        this.producerTitle = producerTitle;
        this.budgetAmount = budgetAmount;
    }

    @Override
    public String toString() {
        return "Producer [producerTitle=" + producerTitle +
                ", budgetAmount=" + budgetAmount + "]";
    }
}
