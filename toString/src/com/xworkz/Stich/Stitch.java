package com.xworkz.Stich;

public class Stitch {
    int stitchId;
    double cost;
    String[] fabricTypes;
    StitchType stitchMode;
    Tailor tailorDetails;

    Stitch(int stitchId, double cost, String[] fabricTypes,
           StitchType stitchMode, Tailor tailorDetails) {

        this.stitchId = stitchId;
        this.cost = cost;
        this.fabricTypes = fabricTypes;
        this.stitchMode = stitchMode;
        this.tailorDetails = tailorDetails;
    }


    public void startStitch() {
        System.out.println("Stitch started with ID: " + stitchId);
    }


    public void showCost() {
        System.out.println("Cost: " + cost);
    }

    @Override
    public String toString() {
        return "Stitch [stitchId=" + stitchId +
                ", cost=" + cost +
                ", stitchMode=" + stitchMode +
                ", tailorDetails=" + tailorDetails + "]";
    }
}
