package com.xworkz.Krmarket.Shop;

public interface Shop {
    void business();



    default void sell (){
        System.out.println(" Executing sell in Shop interface ");
    }
}
