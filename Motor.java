class Motor {

    String brand;
    int power;
    double price;
    boolean automatic;
    String type;

    Battery1 battery;
    Controller controller;
    CoolingSystem coolingSystem;
    Manufacturer1 manufacturer;
    Warranty1 warranty;

    Motor(String brand,int power, double price, boolean automatic,String type,Battery1 battery, Controller controller, CoolingSystem coolingSystem, Manufacturer1 manufacturer, Warranty1 warranty) {

        this.brand = brand;
        this.power = power;
        this.price = price;
        this.automatic = automatic;
        this.type = type;

        this.battery = battery;
        this.controller = controller;
        this.coolingSystem = coolingSystem;
        this.manufacturer = manufacturer;
        this.warranty = warranty;
    }
}