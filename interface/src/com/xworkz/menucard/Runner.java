package com.xworkz.menucard;

public class Runner {
    public static void main(String[] args) {

        MenuCard binded = new BindedMenuCard();
        Kitchen kitchen1 = new Kitchen(binded);
        kitchen1.serveFood();

        MenuCard digital = new DigitalMenuCard();
        Kitchen kitchen2 = new Kitchen(digital);
        kitchen2.serveFood();
    }
}