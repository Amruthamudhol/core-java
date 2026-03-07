class Bell {

    String name;
    double price;
    boolean electric;
    int quantity;
    String color;

    Sound sound;
    Material material;
    Size size;
    Manufacturer3 manufacturer;
    Warranty2 warranty;

    Bell(String name, double price, boolean electric, int quantity, String color,
         Sound sound, Material material, Size size, Manufacturer3 manufacturer, Warranty2 warranty) {

        this.name = name;
        this.price = price;
        this.electric = electric;
        this.quantity = quantity;
        this.color = color;

        this.sound = sound;
        this.material = material;
        this.size = size;
        this.manufacturer = manufacturer;
        this.warranty = warranty;
    }
}