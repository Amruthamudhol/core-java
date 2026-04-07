package com.xworkz.bank.Product;

public class GroceryStore {
    Grocery[] items = new Grocery[5];
    int count;

    void addItem(Grocery grocery) {
        if (grocery != null && items != null) {
            if (count < this.items.length) {
                items[count] = grocery;
                System.out.print("Item stored at " + count + " -> ");
                grocery.info();
                System.out.println("~~~~~~~~~");
                count++;

            } else {
                System.out.println("No space available");
            }

        } else {
            System.out.println("Grocery object is null");
        }
    }


    boolean searchByName(String searchName) {
        System.out.println("searchByName");
        if (this.items != null) {
            for (Grocery grocery : this.items) {
                if (grocery != null && grocery.itemName.equals(searchName)) {

                    System.out.println(">>> Match Found <<<");
                    grocery.info();
                    return true;
                }
            }
        }

        System.out.println("Item not found");
        return false;
    }


    boolean updatePrice(String searchName, double newPrice) {

        System.out.println("updatePrice");

        if (this.items != null) {
            for (Grocery grocery : this.items) {
                if (grocery != null && grocery.itemName.equals(searchName)) {

                    grocery.pricePerUnit = newPrice;

                    System.out.println("Updated Price : " + grocery.pricePerUnit);
                    return true;
                }
            }
        }
        return false;
    }
}
