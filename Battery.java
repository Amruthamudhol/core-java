class Battery {

    String brand;
    String type;       
    int capacity;      
    double voltage;
    boolean isRechargeable;

    Battery() {
        System.out.println("Constructor 1: Default");
    }

    Battery(String brand) {
        this.brand = brand;
    }

    Battery(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    Battery(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }
    Battery(String brand, String type, int capacity, double voltage) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.voltage = voltage;
    }

    Battery(String brand, String type, int capacity, double voltage, boolean isRechargeable) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.voltage = voltage;
        this.isRechargeable = isRechargeable;
    }
}