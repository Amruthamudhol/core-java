package com.xworkz.bank.Product;

public class ShopOperations {
    Shop[] storeList = new Shop[5];
    int position;

    void storeShop(Shop shop) {
        if (shop != null && storeList != null) {
            if (position < this.storeList.length) {
                storeList[position] = shop;
                System.out.print("Shop stored at " + position + " -> ");
                shop.info();
                System.out.println("~~~~~~~~~");
                position++;

            } else {
                System.out.println("Storage full");
            }

        } else {
            System.out.println("Shop object is null");
        }
    }


    boolean searchByTitle(String searchTitle) {
        System.out.println("searchByTitle");
        if (this.storeList != null) {
            for (Shop shop : this.storeList) {
                if (shop != null && shop.storeTitle.equals(searchTitle)) {
                    System.out.println(">>> Match Found <<<");
                    shop.info();
                    return true;
                }
            }
        }

        System.out.println("Shop not found");
        return false;
    }


    boolean updateArea(String searchTitle, String newArea) {

        System.out.println("updateArea");

        if (this.storeList != null) {
            for (Shop shop : this.storeList) {
                if (shop != null && shop.storeTitle.equals(searchTitle)) {

                    shop.area = newArea;

                    System.out.println("Updated Area : " + shop.area);
                    return true;
                }
            }
        }

        return false;
    }
}
