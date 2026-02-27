class Paper {

    String brandName;
    String paperType;
    String color;
    String size;
    int gsm;
    double pricePerReam;
    int sheetsPerReam;
    String texture;
    boolean isRecycled;
    boolean isWaterproof;
    String manufacturer;
    String countryOfOrigin;
    String finishType;
    String usageType;
    String packagingType;
    double weight;
    String qualityGrade;
    String brightnessLevel;
    String thickness;
    String expiryDate;

    Paper(String brandName, String paperType, String color, String size,
          int gsm, double pricePerReam, int sheetsPerReam, String texture,
          boolean isRecycled, boolean isWaterproof, String manufacturer,
          String countryOfOrigin, String finishType, String usageType,
          String packagingType, double weight, String qualityGrade,
          String brightnessLevel, String thickness, String expiryDate) {

        this.brandName = brandName;
        this.paperType = paperType;
        this.color = color;
        this.size = size;
        this.gsm = gsm;
        this.pricePerReam = pricePerReam;
        this.sheetsPerReam = sheetsPerReam;
        this.texture = texture;
        this.isRecycled = isRecycled;
        this.isWaterproof = isWaterproof;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.finishType = finishType;
        this.usageType = usageType;
        this.packagingType = packagingType;
        this.weight = weight;
        this.qualityGrade = qualityGrade;
        this.brightnessLevel = brightnessLevel;
        this.thickness = thickness;
        this.expiryDate = expiryDate;
    }

    void displayDetails() {

        System.out.println("Brand Name: " + brandName);
        System.out.println("Paper Type: " + paperType);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("GSM: " + gsm);
        System.out.println("Price Per Ream: " + pricePerReam);
        System.out.println("Sheets Per Ream: " + sheetsPerReam);
        System.out.println("Texture: " + texture);
        System.out.println("Is Recycled: " + isRecycled);
        System.out.println("Is Waterproof: " + isWaterproof);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Weight: " + weight);
        System.out.println("Quality Grade: " + qualityGrade);
        System.out.println("Brightness Level: " + brightnessLevel);
        System.out.println("Thickness: " + thickness);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("--------------------------------------------");
    }
}