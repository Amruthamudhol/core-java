class Bell {

    String brand;
    double price;
    boolean electric;
    int weight;
    String color;

    Sound sound;
    Material material;
    Size size;
    Manufacturer3 manufacturer;
    Warranty2 warranty;

    Bell(String brand, double price, boolean electric, int weight, String color,
         Sound sound, Material material, Size size, Manufacturer3 manufacturer, Warranty2 warranty) {

        this.brand = brand;
        this.price = price;
        this.electric = electric;
        this.weight = weight;
        this.color = color;
        this.sound = sound;
        this.material = material;
        this.size = size;
        this.manufacturer = manufacturer;
        this.warranty = warranty;
    }
}