package com.xworkz.bank.Product;

public class Shop {
    int storeCode;
    String storeTitle;
    String proprietor;
    String area;
    double dailyIncome;

    public Shop(int storeCode, String storeTitle, String proprietor, String area, double dailyIncome) {
        this.storeCode = storeCode;
        this.storeTitle = storeTitle;
        this.proprietor = proprietor;
        this.area = area;
        this.dailyIncome = dailyIncome;
    }

    void info() {
        System.out.println("Store Code  : " + storeCode);
        System.out.println("Store Title : " + storeTitle);
        System.out.println("Proprietor  : " + proprietor);
        System.out.println("Area        : " + area);
        System.out.println("DailyIncome : " + dailyIncome);
    }
}
