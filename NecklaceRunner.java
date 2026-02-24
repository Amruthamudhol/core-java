class NecklaceRunner {

    public static void main(String[] args) {

        Necklace necklace = new Necklace(
            "Malabar Gold",
            "Gold",
            "Golden",
            55000.0,
            25.5,
            "18 inches",
            "Chain",
            "Emerald",
            "Hook",
            true,
            "Women",
            "India",
            "Traditional",
            true,
            3,
            "Wedding",
            "22K Gold",
            false,
            5,
            "NK98765"
        );

        System.out.println("Brand: " + necklace.brand);
        System.out.println("Material: " + necklace.material);
        System.out.println("Color: " + necklace.color);
        System.out.println("Price: " + necklace.price);
        System.out.println("Weight: " + necklace.weight + " grams");
        System.out.println("Length: " + necklace.length);
        System.out.println("Type: " + necklace.type);
        System.out.println("Stone Type: " + necklace.stoneType);
        System.out.println("Clasp Type: " + necklace.claspType);
        System.out.println("Adjustable: " + necklace.isAdjustable);
        System.out.println("Gender: " + necklace.gender);
        System.out.println("Origin Country: " + necklace.originCountry);
        System.out.println("Design Style: " + necklace.designStyle);
        System.out.println("Handmade: " + necklace.isHandmade);
        System.out.println("Warranty Years: " + necklace.warrantyYears);
        System.out.println("Occasion: " + necklace.occasion);
        System.out.println("Plating: " + necklace.plating);
        System.out.println("Waterproof: " + necklace.isWaterproof);
        System.out.println("Rating: " + necklace.rating + " Stars");
        System.out.println("Model Number: " + necklace.modelNumber);
    }
}