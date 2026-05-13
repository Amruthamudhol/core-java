package com.xworkz.menucard;

public class BindedMenuCard implements MenuCard
{
    BindedMenuCard() {
    }

    public static BindedMenuCard createBindedMenuCard() {
        return new BindedMenuCard();
    }

    @Override
    public void getItems(int itemId, String itemName) {
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Items available in Binded Menu Card");
    }
}
