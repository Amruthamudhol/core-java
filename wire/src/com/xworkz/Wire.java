package com.xworkz;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other;

public class Wire {
    public String material;
    public double length;
    public double price;

    public Wire(String material, double length, double price) {
        this.material = material;
        this.length = length;
        this.price = price;

    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Wire) {

            Wire right = (Wire) obj;

            if(this.material == right.material &&
                    this.length == right.length &&
                    this.price  == right.price)
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
        return "Wire{" +
                "material='" + material + '\'' +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}
