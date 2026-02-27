class WallPaper {

    String brandName;
    String designName;
    String color;
    String material;
    String texture;
    String size;
    double price;
    String patternType;
    boolean isWaterproof;
    boolean isWashable;
    String finishType;
    String roomType;
    String countryOfOrigin;
    int rollLength;
    int rollWidth;
    double weight;
    String installationType;
    String durability;
    String warranty;
    String manufacturer;

    WallPaper(String brandName, String designName, String color, String material,
              String texture, String size, double price, String patternType,
              boolean isWaterproof, boolean isWashable, String finishType,
              String roomType, String countryOfOrigin, int rollLength,
              int rollWidth, double weight, String installationType,
              String durability, String warranty, String manufacturer) {

        this.brandName = brandName;
        this.designName = designName;
        this.color = color;
        this.material = material;
        this.texture = texture;
        this.size = size;
        this.price = price;
        this.patternType = patternType;
        this.isWaterproof = isWaterproof;
        this.isWashable = isWashable;
        this.finishType = finishType;
        this.roomType = roomType;
        this.countryOfOrigin = countryOfOrigin;
        this.rollLength = rollLength;
        this.rollWidth = rollWidth;
        this.weight = weight;
        this.installationType = installationType;
        this.durability = durability;
        this.warranty = warranty;
        this.manufacturer = manufacturer;
    }

    void display() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Design Name: " + designName);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Texture: " + texture);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Pattern Type: " + patternType);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Washable: " + isWashable);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Room Type: " + roomType);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Roll Length: " + rollLength);
        System.out.println("Roll Width: " + rollWidth);
        System.out.println("Weight: " + weight);
        System.out.println("Installation Type: " + installationType);
        System.out.println("Durability: " + durability);
        System.out.println("Warranty: " + warranty);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("--------------------------------------------------");
    }
}