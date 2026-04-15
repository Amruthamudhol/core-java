package com.xworkz.Belt;

public class LeatherBelt extends Belt{
    String leatherQuality;
    boolean reversible;

    LeatherBelt(int beltId, double length, String[] colorChoices,
                BeltType category, BrandInfo brandDetails,
                String leatherQuality, boolean reversible) {

        super(beltId, length, colorChoices, category, brandDetails);
        this.leatherQuality = leatherQuality;
        this.reversible = reversible;
    }

    @Override
    public void wearBelt() {
        System.out.println("Wearing premium leather belt ID: " + beltId);
    }

    @Override
    public void showLength() {
        System.out.println("Leather belt length: " + length);
    }

    @Override
    public String toString() {
        return "LeatherBelt [beltId=" + beltId +
                ", length=" + length +
                ", category=" + category +
                ", brandDetails=" + brandDetails +
                ", leatherQuality=" + leatherQuality +
                ", reversible=" + reversible + "]";
    }

}
