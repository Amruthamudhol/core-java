package com.xworkz.bank.Product;

public class Medicine {
    int itemNo;
    String itemLabel;
    String supplier;
    double amount;
    String expiry;

    public Medicine(int itemNo, String itemLabel, String supplier, double amount, String expiry) {
        this.itemNo = itemNo;
        this.itemLabel = itemLabel;
        this.supplier = supplier;
        this.amount = amount;
        this.expiry = expiry;
    }

    void info() {
        System.out.println("Item No  : " + itemNo);
        System.out.println("Label    : " + itemLabel);
        System.out.println("Supplier : " + supplier);
        System.out.println("Amount   : " + amount);
        System.out.println("Expiry   : " + expiry);
    }
}
