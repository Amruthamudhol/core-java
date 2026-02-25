class Umbrella {

    String brand;
    String color;
    double price;
    int size;
    boolean isAutomatic;

    Umbrella() {
        System.out.println("Constructor 1: Default");
    }

    Umbrella(String brand) {
        this.brand = brand;
    }

    Umbrella(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    Umbrella(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    Umbrella(String brand, String color, double price, int size) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    Umbrella(String brand, String color, double price, int size, boolean isAutomatic) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
        this.isAutomatic = isAutomatic;
    }
}