class Spa {

    String name;
    int rooms;
    double price;
    boolean openToday;
    String location;

    Therapist therapist;
    Service service;
    Equipment1 equipment;
    Manager manager;
    Timing timing;

    Spa(String name, int rooms, double price, boolean openToday, String location,
        Therapist therapist, Service service, Equipment1 equipment, Manager manager, Timing timing) {

        this.name = name;
        this.rooms = rooms;
        this.price = price;
        this.openToday = openToday;
        this.location = location;

        this.therapist = therapist;
        this.service = service;
        this.equipment = equipment;
        this.manager = manager;
        this.timing = timing;
    }
}