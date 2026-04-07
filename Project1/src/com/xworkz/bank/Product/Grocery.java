package com.xworkz.bank.Product;

public class Grocery {
    int itemCode;
    String itemName;
    String brandName;
    double pricePerUnit;
    String category;

    public Grocery(int itemCode, String itemName, String brandName, double pricePerUnit, String category) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.brandName = brandName;
        this.pricePerUnit = pricePerUnit;
        this.category = category;
    }

    void info() {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Brand     : " + brandName);
        System.out.println("Price     : " + pricePerUnit);
        System.out.println("Category  : " + category);
    }
}
