class Filter {

    String brand;
    int power;

    Filter(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void printDetails() {
        System.out.println("Filter Brand: " + this.brand);
        System.out.println("Power: " + this.power);
    }
}