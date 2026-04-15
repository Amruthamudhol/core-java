package com.xworkz.Room;

public class Room {
    int roomNumber;
    float rent;
    String[] facilities;
    RoomType type;
    Building building;

    Room(int roomNumber, float rent, String[] facilities,
         RoomType type, Building building) {

        this.roomNumber = roomNumber;
        this.rent = rent;
        this.facilities = facilities;
        this.type = type;
        this.building = building;
    }

    public void bookRoom() {
        System.out.println("Room booked: " + roomNumber);
    }

    public void showRent() {
        System.out.println("Rent: " + rent);
    }

    @Override
    public String toString() {
        return "Room [roomNumber=" + roomNumber +
                ", rent=" + rent +
                ", type=" + type +
                ", building=" + building + "]";
    }
}
