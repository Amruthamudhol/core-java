class Garlic {

    String garlicType;
    String color;
    String size;
    double pricePerKg;
    int quantityInStock;
    String originCountry;
    String brand;
    boolean isOrganic;
    String grade;
    String harvestSeason;
    String supplierName;
    String storageType;
    double weight;
    String packagingType;
    String expiryDate;
    String quality;
    String tasteLevel;
    String usageType;
    String exportQuality;
    String certification;

    Garlic(String garlicType, String color, String size, double pricePerKg,
           int quantityInStock, String originCountry, String brand,
           boolean isOrganic, String grade, String harvestSeason,
           String supplierName, String storageType, double weight,
           String packagingType, String expiryDate, String quality,
           String tasteLevel, String usageType, String exportQuality,
           String certification) {

        this.garlicType = garlicType;
        this.color = color;
        this.size = size;
        this.pricePerKg = pricePerKg;
        this.quantityInStock = quantityInStock;
        this.originCountry = originCountry;
        this.brand = brand;
        this.isOrganic = isOrganic;
        this.grade = grade;
        this.harvestSeason = harvestSeason;
        this.supplierName = supplierName;
        this.storageType = storageType;
        this.weight = weight;
        this.packagingType = packagingType;
        this.expiryDate = expiryDate;
        this.quality = quality;
        this.tasteLevel = tasteLevel;
        this.usageType = usageType;
        this.exportQuality = exportQuality;
        this.certification = certification;
    }

    void showDetails() {

        System.out.println("Garlic Type: " + garlicType);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price Per Kg: " + pricePerKg);
        System.out.println("Quantity In Stock: " + quantityInStock);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Brand: " + brand);
        System.out.println("Is Organic: " + isOrganic);
        System.out.println("Grade: " + grade);
        System.out.println("Harvest Season: " + harvestSeason);
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Storage Type: " + storageType);
        System.out.println("Weight: " + weight);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Quality: " + quality);
        System.out.println("Taste Level: " + tasteLevel);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Export Quality: " + exportQuality);
        System.out.println("Certification: " + certification);
        System.out.println("------------------------------------------");
    }
}