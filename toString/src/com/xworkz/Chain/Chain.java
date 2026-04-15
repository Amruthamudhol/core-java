package com.xworkz.Chain;

public class Chain {
    long serialNumber;
    float thickness;
    String[] patternList;
    MetalType metal;
    Vendor vendorDetails;

    Chain(long serialNumber, float thickness, String[] patternList, MetalType metal, Vendor vendorDetails) {

        this.serialNumber = serialNumber;
        this.thickness = thickness;
        this.patternList = patternList;
        this.metal = metal;
        this.vendorDetails = vendorDetails;
    }


    public void displayChain() {
        System.out.println("Chain Serial: " + serialNumber);
    }

    public void showThickness() {
        System.out.println("Thickness: " + thickness);
    }

    @Override
    public String toString() {
        return "Chain [serialNumber=" + serialNumber +
                ", thickness=" + thickness +
                ", metal=" + metal +
                ", vendorDetails=" + vendorDetails + "]";
    }
}
