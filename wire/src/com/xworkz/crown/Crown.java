package com.xworkz.crown;

public class Crown {
    String material;
    String color;
    int gems;

    public Crown(String material, String color, int gems) {
        this.material = material;
        this.color = color;
        this.gems = gems;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Crown) {

            Crown other = (Crown) obj;

            if(this.material == other.material &&
                    this.color ==  other.color &&
                    this.gems == other.gems) {

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
        return "Crown{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", gems=" + gems +
                '}';
    }
}
