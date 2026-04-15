package com.xworkz.MedicalShop;

public class Distributor {
    int distributorCode;
    String region;

    Distributor(int distributorCode, String region) {
        this.distributorCode = distributorCode;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Distributor [distributorCode=" + distributorCode +
                ", region=" + region + "]";
    }
}
