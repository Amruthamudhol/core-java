class Stand {

    String standName;
    String standType;
    String material;
    String color;
    double price;
    double height;
    double width;
    double weight;
    String brand;
    String manufacturer;
    String countryOfOrigin;
    String usageType;
    boolean isFoldable;
    boolean isAdjustable;
    String warranty;
    String shape;
    String finishType;
    int loadCapacity;
    String modelNumber;
    String availabilityStatus;

    Stand(String standName, String standType, String material, String color,
          double price, double height, double width, double weight,
          String brand, String manufacturer, String countryOfOrigin,
          String usageType, boolean isFoldable, boolean isAdjustable,
          String warranty, String shape, String finishType,
          int loadCapacity, String modelNumber, String availabilityStatus) {

        this.standName = standName;
        this.standType = standType;
        this.material = material;
        this.color = color;
        this.price = price;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.usageType = usageType;
        this.isFoldable = isFoldable;
        this.isAdjustable = isAdjustable;
        this.warranty = warranty;
        this.shape = shape;
        this.finishType = finishType;
        this.loadCapacity = loadCapacity;
        this.modelNumber = modelNumber;
        this.availabilityStatus = availabilityStatus;
    }

    void displayStandDetails() {

        System.out.println("Stand Name: " + standName);
        System.out.println("Stand Type: " + standType);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Weight: " + weight);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Is Foldable: " + isFoldable);
        System.out.println("Is Adjustable: " + isAdjustable);
        System.out.println("Warranty: " + warranty);
        System.out.println("Shape: " + shape);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Availability Status: " + availabilityStatus);
        System.out.println("---------------------------------------------");
    }
}