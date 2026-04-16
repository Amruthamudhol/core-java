package com.xworkz.slipper;

public class PremiumSlipper extends Slipper {
    String materialType;
    int warrantyYears;


    PremiumSlipper(String modelName, int footSize, double cost,
                   String[] shadeList, Category categoryType,
                   Company manufacturer, String materialType, int warrantyYears) {

        super(modelName, footSize, cost, shadeList, categoryType, manufacturer);
        this.materialType = materialType;
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void useItem() {
        System.out.println("Using premium slipper model: " + modelName);
    }

    @Override
    public void showCost() {
        double updatedCost = cost + 200;
        System.out.println("Premium Cost: " + updatedCost);
    }


}
