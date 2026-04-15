package com.xworkz.Room;

public class LuxuryRoom  extends Room{
    boolean hasBalcony;
    double serviceCharge;

    LuxuryRoom(int roomNumber, float rent, String[] facilities,
               RoomType type, Building building,
               boolean hasBalcony, double serviceCharge) {

        super(roomNumber, rent, facilities, type, building);
        this.hasBalcony = hasBalcony;
        this.serviceCharge = serviceCharge;
    }

    @Override
    public void bookRoom() {
        System.out.println("Luxury room booked: " + roomNumber);
    }

    @Override
    public void showRent() {
        System.out.println("Luxury room rent: " + rent);
    }

    @Override
    public String toString() {
        return "LuxuryRoom [roomNumber=" + roomNumber +
                ", rent=" + rent +
                ", type=" + type +
                ", building=" + building +
                ", hasBalcony=" + hasBalcony +
                ", serviceCharge=" + serviceCharge + "]";
    }
}
