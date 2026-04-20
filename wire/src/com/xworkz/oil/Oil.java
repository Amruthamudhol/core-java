package com.xworkz.oil;

public class Oil {
    String brand;
    String type;
    double quantity;

    public Oil(String brand, String type, double quantity) {
        this.brand = brand;
        this.type = type;
        this.quantity = quantity;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Oil) {

            Oil right = (Oil) obj;

            if (this.brand == right.brand &&
                    this.type == right.type &&
                    this.quantity == right.quantity) {

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
        return "Oil{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
