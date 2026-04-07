package com.xworkz.bank.Product;

public class MedicineRunner {
    public static void main(String[] args) {

        MedicineStore store = new MedicineStore();

        Medicine m1 = new Medicine(1, "Panadol", "GSK", 25, "12-2026");
        store.add(m1);

        Medicine m2 = new Medicine(2, "Benadryl", "Johnson", 60, "05-2027");
        store.add(m2);

        Medicine m3 = new Medicine(3, "colpol", "Pfizer", 45, "08-2027");
        store.add(m3);

        store.search("Benadryl");

        store.update("Panadol", 30);
    }
}
