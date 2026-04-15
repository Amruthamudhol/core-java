package com.xworkz.Plate;

public class PremiumPlate extends Plate{
    int durabilityYears;
    boolean microwaveSafe;

    PremiumPlate(long itemCode, float thickness, String[] printStyles,
                 UsageType usage, Factory productionUnit,
                 int durabilityYears, boolean microwaveSafe) {

        super(itemCode, thickness, printStyles, usage, productionUnit);
        this.durabilityYears = durabilityYears;
        this.microwaveSafe = microwaveSafe;
    }


    @Override
    public void serveFood() {
        System.out.println("Serving food on premium plate: " + itemCode);
    }


    @Override
    public void showThickness() {
        System.out.println("Premium plate thickness: " + thickness);
    }


    @Override
    public String toString() {
        return "PremiumPlate [itemCode=" + itemCode +
                ", thickness=" + thickness +
                ", usage=" + usage +
                ", productionUnit=" + productionUnit +
                ", durabilityYears=" + durabilityYears +
                ", microwaveSafe=" + microwaveSafe + "]";
    }
}
