class Floor {

    String floorName;
    int roomCount;

    Floor(String floorName, int roomCount) {
        this.floorName = floorName;
        this.roomCount = roomCount;
    }

    void display() {
        System.out.println("Floor: " + this.floorName + " Rooms: " + this.roomCount);
    }
}