package com.xworkz.slipper;

public class Slipper {
    String modelName;
    int footSize;
    double cost;
    String[] shadeList;
    Category categoryType;
    Company manufacturer;


    public Slipper(String modelName, int footSize, double cost, String[] shadeList, Category categoryType, Company manufacturer) {
        this.modelName = modelName;
        this.footSize = footSize;
        this.cost = cost;
        this.shadeList = shadeList;
        this.categoryType = categoryType;
        this.manufacturer = manufacturer;
    }

    public void useItem() {
        System.out.println("Using slipper model: " + modelName);
    }


    public void showCost() {
        System.out.println("Cost: " + cost);
    }

    @Override
    public String toString() {
        return "Slipper [modelName=" + modelName + ", footSize=" + footSize + ", cost=" + cost + ", categoryType=" + categoryType +
                ", manufacturer=" + manufacturer + "]";
    }
}
