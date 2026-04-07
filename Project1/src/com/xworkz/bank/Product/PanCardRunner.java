package com.xworkz.bank.Product;

public class PanCardRunner {
    public static void main(String[] args) {

        PanCardManager manager = new PanCardManager();

        PanCard c1 = new PanCard("111", "Amruta", "Ashok", "11-07-2004", "Belagavi");
        manager.storeCard(c1);

        PanCard c2 = new PanCard("222", "Akshata", "Girija", "30-12-2002", "Bangalore");
        manager.storeCard(c2);

        PanCard c3 = new PanCard("333", "Kiran", "Ravi", "01-09-2000", "Hubli");
        manager.storeCard(c3);
        manager.searchByPanId("333");
        manager.updateCityByPan("111", "Bagalkot");
    }
}
