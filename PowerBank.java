class PowerBank {

    String brand;
    int capacity;
    double price;

    void charge() {
        System.out.println("PowerBank is charging device");
    }

    void showLevel() {
        System.out.println("Showing battery level");
    }

    void showPowerBank() {
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity);
        System.out.println("price: " + price);
    }
}