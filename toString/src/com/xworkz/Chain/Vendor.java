package com.xworkz.Chain;

public class Vendor {
    String vendorName;
    int vendorRating;

    Vendor(String vendorName, int vendorRating) {
        this.vendorName = vendorName;
        this.vendorRating = vendorRating;
    }

    @Override
    public String toString() {
        return "Vendor [vendorName=" + vendorName +
                ", vendorRating=" + vendorRating + "]";
    }
}
