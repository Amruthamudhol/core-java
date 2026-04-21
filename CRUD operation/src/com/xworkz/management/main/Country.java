package com.xworkz.management.main;

public class Country {
    public String name;
    public President president;
    public State[] states;

    public Country(String name, President president, State[] states) {
        this.name = name;
        this.president = president;
        this.states = states;
    }
}
