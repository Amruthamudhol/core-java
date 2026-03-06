class Battery1 {

    String batteryType;
    int capacity;

    Battery1(String batteryType, int capacity) {
        this.batteryType = batteryType;
        this.capacity = capacity;
    }

    void printDetails() {
        System.out.println("Battery Details:");
        System.out.println("Battery Type: " + this.batteryType);
        System.out.println("Capacity: " + this.capacity + " mAh");
    }
}