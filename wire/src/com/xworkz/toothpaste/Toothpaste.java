package com.xworkz.toothpaste;

public class Toothpaste {
    String brand;
    String flavor;
    double weight;

    public Toothpaste(String brand, String flavor, double weight) {
        this.brand = brand;
        this.flavor = flavor;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Toothpaste) {

            Toothpaste other = (Toothpaste) obj;

            if(this.brand == other.brand &&
                    this.flavor == other.flavor &&
                    this.weight == other.weight) {

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
        return "Toothpaste{" +
                "brand='" + brand + '\'' +
                ", flavor='" + flavor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
