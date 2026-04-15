package com.xworkz.Belt;

public class Belt {
    int beltId;
    double length;
    String[] colorChoices;
    BeltType category;
    BrandInfo brandDetails;

    Belt(int beltId, double length, String[] colorChoices,
         BeltType category, BrandInfo brandDetails) {

        this.beltId = beltId;
        this.length = length;
        this.colorChoices = colorChoices;
        this.category = category;
        this.brandDetails = brandDetails;
    }

    public void wearBelt() {
        System.out.println("Wearing belt ID: " + beltId);
    }


    public void showLength() {
        System.out.println("Belt length: " + length);
    }

    @Override
    public String toString() {
        return "Belt [beltId=" + beltId +
                ", length=" + length +
                ", category=" + category +
                ", brandDetails=" + brandDetails + "]";
    }
}
