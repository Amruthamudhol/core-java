package com.xworkz.menucard;

public class Runner {
    public static void main(String[] args) {

        MenuCard menu = BindedMenuCard.createBindedMenuCard();

        Kitchen kitchen = new Kitchen(menu);

        kitchen.serveFood();
    }
}
