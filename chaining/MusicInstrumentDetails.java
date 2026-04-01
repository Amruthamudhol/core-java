class MusicInstrumentDetails extends MusicInstrument {

    double price;
    String brand;
    boolean portable;

    MusicInstrumentDetails(String name, String category, String material,
                           double price, String brand, boolean portable) {

        super(name, category, material);
        this.price = price;
        this.brand = brand;
        this.portable = portable;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Portable: " + portable);
        System.out.println("-------------");
    }
}