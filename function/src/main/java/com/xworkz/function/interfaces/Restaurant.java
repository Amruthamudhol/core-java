package com.xworkz.function.interfaces;

@FunctionalInterface
public interface Restaurant {
    void order(String foodName, int quantity, double price);
}
