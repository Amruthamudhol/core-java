package com.xworkz.MedicalShop;

public class MedicalShopRunner {
    public static void main(String[] args) {

        Distributor d1 = new Distributor(501, "South Zone");

        String[] drugs = {"Tablet A", "Syrup B"};

        MedicalShop ms1 = new MedicalShop("HealthPlus", 15000.0,
                drugs, ServiceMode.LOCAL, d1);

        ClinicPharmacy ms2 = new ClinicPharmacy("Care Clinic", 25000.0,
                drugs, ServiceMode.FRANCHISE, d1, true, 24);

        ms1.operate();
        ms1.showRevenue();
        System.out.println(ms1);

        System.out.println("----------------------");

        ms2.operate();
        ms2.showRevenue();
        System.out.println(ms2);
    }
}
