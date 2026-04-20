package com.xworkz.watermelon;

public class Watermelon {
    public String color;
    public double weight;
    public int seeds;

    public Watermelon(String color, double weight, int seeds) {
        this.color = color;
        this.weight = weight;
        this.seeds = seeds;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Watermelon) {

            Watermelon other = (Watermelon) obj;

            if(this.color == other.color &&
                    this.weight == other.weight &&
                    this.seeds  == other.seeds)
            {

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
        return "Watermelon{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", seeds=" + seeds +
                '}';
    }
}
