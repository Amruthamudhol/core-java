package com.xworkz.trolley;

public class Trolley {
    String brand;
    String type;
    double capacity;

    public Trolley(String brand, String type, double capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Trolley) {

            Trolley right = (Trolley) obj;

            if (this.brand == right.brand &&
                    this.type == right.type &&
                    this.capacity == right.capacity) {

                return true;

            } else {

                return false;
            }

        } else {

            return false;
        }
    }

    @Override
    public String toString() {
        return "Trolley{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
