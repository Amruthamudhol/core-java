package com.xworkz.bank.Product;

public class GroceryRunner {
    public static void main(String[] args) {

        GroceryStore store = new GroceryStore();

        Grocery g1 = new Grocery(1, "Rice", "IndiaGate", 60, "Grains");
        store.addItem(g1);

        Grocery g2 = new Grocery(2, "Oil", "Fortune", 180, "Cooking");
        store.addItem(g2);

        Grocery g3 = new Grocery(3, "Sugar", "Madhur", 45, "Sweetener");
        store.addItem(g3);
        store.searchByName("Oil");
        store.updatePrice("Rice", 65);
    }
}
