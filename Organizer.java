class Organizer {

    String name;
    String type;
    String material;
    String color;
    double price;
    String brand;
    int compartments;
    boolean waterproof;
    double weight;
    String size;
    String shape;
    String usage;
    String country;
    String manufacturer;
    String warranty;
    boolean ecoFriendly;
    String pattern;
    int capacity;
    String closureType;
    boolean portable;

    Organizer(String name, String type, String material, String color,
              double price, String brand, int compartments, boolean waterproof,
              double weight, String size, String shape, String usage,
              String country, String manufacturer, String warranty,
              boolean ecoFriendly, String pattern, int capacity,
              String closureType, boolean portable) {

        this.name = name;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.compartments = compartments;
        this.waterproof = waterproof;
        this.weight = weight;
        this.size = size;
        this.shape = shape;
        this.usage = usage;
        this.country = country;
        this.manufacturer = manufacturer;
        this.warranty = warranty;
        this.ecoFriendly = ecoFriendly;
        this.pattern = pattern;
        this.capacity = capacity;
        this.closureType = closureType;
        this.portable = portable;
    }

    void displayOrganizer() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Compartments: " + compartments);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Weight: " + weight);
        System.out.println("Size: " + size);
        System.out.println("Shape: " + shape);
        System.out.println("Usage: " + usage);
        System.out.println("Country: " + country);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Warranty: " + warranty);
        System.out.println("Eco Friendly: " + ecoFriendly);
        System.out.println("Pattern: " + pattern);
        System.out.println("Capacity: " + capacity);
        System.out.println("Closure Type: " + closureType);
        System.out.println("Portable: " + portable);
        System.out.println("-------------------------------------");
    }
}