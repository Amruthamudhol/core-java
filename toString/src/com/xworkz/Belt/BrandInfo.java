package com.xworkz.Belt;

public class BrandInfo {
    String brandLabel;
    String originCountry;

    BrandInfo(String brandLabel, String originCountry) {
        this.brandLabel = brandLabel;
        this.originCountry = originCountry;
    }

    @Override
    public String toString() {
        return "BrandInfo [brandLabel=" + brandLabel +
                ", originCountry=" + originCountry + "]";
    }
}
