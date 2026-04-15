package com.xworkz.Concert;

public class Organizer {
    String organizerName;
    String city;

    Organizer(String organizerName, String city) {
        this.organizerName = organizerName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Organizer [organizerName=" + organizerName + ", city=" + city + "]";
    }
}
