package com.xworkz.menucard;

public class Kitchen {
    MenuCard menuCard;

    Kitchen(MenuCard menuCard) {
        this.menuCard = menuCard;
    }

    public void serveFood() {
        System.out.println("Kitchen is preparing food");

        if (menuCard != null) {
            menuCard.getItems(101, "Biryani");
        }
    }
}
