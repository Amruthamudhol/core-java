class Pepper {

    String pepperName;
    String color;
    String type;
    String originCountry;
    String tasteLevel;
    double pricePerKg;
    int quantityInStock;
    String brand;
    String packagingType;
    double weight;
    String expiryDate;
    boolean isOrganic;
    boolean isSpicy;
    String grade;
    String harvestSeason;
    String supplierName;
    String storageCondition;
    String certification;
    String exportQuality;
    String usageType;

    Pepper(String pepperName, String color, String type, String originCountry,
           String tasteLevel, double pricePerKg, int quantityInStock,
           String brand, String packagingType, double weight,
           String expiryDate, boolean isOrganic, boolean isSpicy,
           String grade, String harvestSeason, String supplierName,
           String storageCondition, String certification,
           String exportQuality, String usageType) {

        this.pepperName = pepperName;
        this.color = color;
        this.type = type;
        this.originCountry = originCountry;
        this.tasteLevel = tasteLevel;
        this.pricePerKg = pricePerKg;
        this.quantityInStock = quantityInStock;
        this.brand = brand;
        this.packagingType = packagingType;
        this.weight = weight;
        this.expiryDate = expiryDate;
        this.isOrganic = isOrganic;
        this.isSpicy = isSpicy;
        this.grade = grade;
        this.harvestSeason = harvestSeason;
        this.supplierName = supplierName;
        this.storageCondition = storageCondition;
        this.certification = certification;
        this.exportQuality = exportQuality;
        this.usageType = usageType;
    }

    void printDetails() {

        System.out.println("Pepper Name: " + pepperName);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Taste Level: " + tasteLevel);
        System.out.println("Price Per Kg: " + pricePerKg);
        System.out.println("Quantity In Stock: " + quantityInStock);
        System.out.println("Brand: " + brand);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Weight: " + weight);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Is Organic: " + isOrganic);
        System.out.println("Is Spicy: " + isSpicy);
        System.out.println("Grade: " + grade);
        System.out.println("Harvest Season: " + harvestSeason);
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Storage Condition: " + storageCondition);
        System.out.println("Certification: " + certification);
        System.out.println("Export Quality: " + exportQuality);
        System.out.println("Usage Type: " + usageType);
        System.out.println("------------------------------------------");
    }
}