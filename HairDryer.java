class HairDryer {

    String brand;
    String color;
    int power;         
    double price;
    boolean isPortable;

    HairDryer() {
        System.out.println("Constructor 1: Default");
    }

    HairDryer(String brand) {
        this.brand = brand;
    }

    HairDryer(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    HairDryer(String brand, String color, int power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }

    HairDryer(String brand, String color, int power, double price) {
        this.brand = brand;
        this.color = color;
        this.power = power;
        this.price = price;
    }

    HairDryer(String brand, String color, int power, double price, boolean isPortable) {
        this.brand = brand;
        this.color = color;
        this.power = power;
        this.price = price;
        this.isPortable = isPortable;
    }
}