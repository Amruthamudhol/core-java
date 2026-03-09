class Horlicks {
    double price;
    Manufacturer manufacturer;
    Flavor flavor;

    Horlicks(double price, Manufacturer manufacturer, Flavor flavor) {
        this.price = price;
        this.manufacturer = manufacturer;
        this.flavor = flavor;
    }

    void printInfo() {
        System.out.println("Horlicks Price: " + this.price);

        if (this.manufacturer != null) {
            System.out.println("Manufacturer Name: " + this.manufacturer.name);
        } else {
            System.out.println("Manufacturer is null");
        }

        System.out.println("----------------------");
    }
}