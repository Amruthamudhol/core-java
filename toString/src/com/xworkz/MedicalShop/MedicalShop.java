package com.xworkz.MedicalShop;

public class MedicalShop {
    String outletName;
    double dailyRevenue;
    String[] drugCatalog;
    ServiceMode mode;
    Distributor supplyChain;

    MedicalShop(String outletName, double dailyRevenue, String[] drugCatalog,
                ServiceMode mode, Distributor supplyChain) {

        this.outletName = outletName;
        this.dailyRevenue = dailyRevenue;
        this.drugCatalog = drugCatalog;
        this.mode = mode;
        this.supplyChain = supplyChain;
    }

    public void operate() {
        System.out.println("Shop operating: " + outletName);
    }

    public void showRevenue() {
        System.out.println("Daily Revenue: " + dailyRevenue);
    }

    @Override
    public String toString() {
        return "MedicalShop [outletName=" + outletName +
                ", dailyRevenue=" + dailyRevenue +
                ", mode=" + mode +
                ", supplyChain=" + supplyChain + "]";
    }
}

