package com.xworkz.menucard;

public class DigitalMenuCard implements MenuCard {

    DigitalMenuCard() {
    }

    public static DigitalMenuCard createDigitalMenuCard() {
        return new DigitalMenuCard();
    }

    @Override
    public void getItems(int itemId, String itemName) {
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Items available in Digital Menu Card");
    }
}
