package com.xworkz.bank.Product;

public class ShopRunner {
    public static void main(String[] args) {

        ShopOperations operations = new ShopOperations();

        Shop s1 = new Shop(101, "SmartMart", "Ravi", "Bangalore", 45000);
        operations.storeShop(s1);

        Shop s2 = new Shop(102, "DailyNeeds", "Sita", "Mysore", 38000);
        operations.storeShop(s2);

        Shop s3 = new Shop(103, "FashionHub", "Kiran", "Hubli", 52000);
        operations.storeShop(s3);


        operations.searchByTitle("FashionHub");
        operations.updateArea("SmartMart", "Belgaum");
    }
}
