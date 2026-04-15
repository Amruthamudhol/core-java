package com.xworkz.Helmet;

public class Supplier {
    long supplierId;
    String supplierCity;

    Supplier(long supplierId, String supplierCity) {
        this.supplierId = supplierId;
        this.supplierCity = supplierCity;
    }

    @Override
    public String toString() {
        return "Supplier [supplierId=" + supplierId + ", supplierCity=" + supplierCity + "]";
    }
}
