package com.xworkz.management.main;

public class State {
    public String name;
    public int population;
    public City[] cities;

    public State(String name, int population, City[] cities) {
        this.name = name;
        this.population = population;
        this.cities = cities;
    }
}
