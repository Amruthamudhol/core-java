class BraceletRunner {

    public static void main(String[] args) {

        Bracelet bracelet = new Bracelet(
            "Tanishq",
            "Gold",
            "Golden",
            25000.0,
            15.5,
            "Chain",
            "Medium",
            true,
            "Women",
            "Diamond",
            "Hook",
            "India",
            "Traditional",
            true,
            2,
            "Wedding",
            "24K Gold",
            false,
            5,
            "BR12345"
        );

        System.out.println("Brand: " + bracelet.brand);
        System.out.println("Material: " + bracelet.material);
        System.out.println("Color: " + bracelet.color);
        System.out.println("Price: " + bracelet.price);
        System.out.println("Weight: " + bracelet.weight + " grams");
        System.out.println("Type: " + bracelet.type);
        System.out.println("Size: " + bracelet.size);
        System.out.println("Adjustable: " + bracelet.isAdjustable);
        System.out.println("Gender: " + bracelet.gender);
        System.out.println("Stone Type: " + bracelet.stoneType);
        System.out.println("Clasp Type: " + bracelet.claspType);
        System.out.println("Origin Country: " + bracelet.originCountry);
        System.out.println("Design Style: " + bracelet.designStyle);
        System.out.println("Handmade: " + bracelet.isHandmade);
        System.out.println("Warranty Years: " + bracelet.warrantyYears);
        System.out.println("Occasion: " + bracelet.occasion);
        System.out.println("Plating: " + bracelet.plating);
        System.out.println("Waterproof: " + bracelet.isWaterproof);
        System.out.println("Rating: " + bracelet.rating + " Stars");
        System.out.println("Model Number: " + bracelet.modelNumber);
    }
}