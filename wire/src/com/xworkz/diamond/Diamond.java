package com.xworkz.diamond;

public class Diamond {
    String color;
    String cut;
    double carat;

    public Diamond(String color, String cut, double carat) {
        this.color = color;
        this.cut = cut;
        this.carat = carat;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Diamond) {

            Diamond right = (Diamond) obj;

            if(this.color== right.color &&
                    this.cut == right.cut &&
                    this.carat == right.carat) {

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
        return "Diamond{" +
                "color='" + color + '\'' +
                ", cut='" + cut + '\'' +
                ", carat=" + carat +
                '}';
    }
}
