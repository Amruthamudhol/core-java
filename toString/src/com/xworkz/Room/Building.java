package com.xworkz.Room;

public class Building {
    String buildingName;
    int floors;

    Building(String buildingName, int floors) {
        this.buildingName = buildingName;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Building [buildingName=" + buildingName +
                ", floors=" + floors + "]";
    }
}
