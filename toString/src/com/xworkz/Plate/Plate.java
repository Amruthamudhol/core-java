package com.xworkz.Plate;

public class Plate {
    long itemCode;
    float thickness;
    String[] printStyles;
    UsageType usage;
    Factory productionUnit;

    Plate(long itemCode, float thickness, String[] printStyles,
          UsageType usage, Factory productionUnit) {

        this.itemCode = itemCode;
        this.thickness = thickness;
        this.printStyles = printStyles;
        this.usage = usage;
        this.productionUnit = productionUnit;
    }

    public void serveFood() {
        System.out.println("Serving food on plate code: " + itemCode);
    }

    public void showThickness() {
        System.out.println("Plate thickness: " + thickness);
    }

    @Override
    public String toString() {
        return "Plate [itemCode=" + itemCode +
                ", thickness=" + thickness +
                ", usage=" + usage +
                ", productionUnit=" + productionUnit + "]";
    }
}
