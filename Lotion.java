class Lotion {

    String brand;
    String type;
    String fragrance;
    double price;
    int quantity;
    String skinType;
    boolean organic;
    boolean dermatologistTested;
    String color;
    String packaging;
    String expiryDate;
    String manufacturer;
    double weight;
    String texture;
    String country;
    double rating;
    int reviews;
    boolean hasSPF;
    String ingredients;
    boolean crueltyFree;

    Lotion(String brand, String type, String fragrance, double price, int quantity,
           String skinType, boolean organic, boolean dermatologistTested,
           String color, String packaging, String expiryDate, String manufacturer,
           double weight, String texture, String country, double rating,
           int reviews, boolean hasSPF, String ingredients, boolean crueltyFree) {

        this.brand = brand;
        this.type = type;
        this.fragrance = fragrance;
        this.price = price;
        this.quantity = quantity;
        this.skinType = skinType;
        this.organic = organic;
        this.dermatologistTested = dermatologistTested;
        this.color = color;
        this.packaging = packaging;
        this.expiryDate = expiryDate;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.texture = texture;
        this.country = country;
        this.rating = rating;
        this.reviews = reviews;
        this.hasSPF = hasSPF;
        this.ingredients = ingredients;
        this.crueltyFree = crueltyFree;
    }

    void displayLotion() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Organic: " + organic);
        System.out.println("Dermatologist Tested: " + dermatologistTested);
        System.out.println("Color: " + color);
        System.out.println("Packaging: " + packaging);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Weight: " + weight);
        System.out.println("Texture: " + texture);
        System.out.println("Country: " + country);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Has SPF: " + hasSPF);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Cruelty Free: " + crueltyFree);
        System.out.println("------------------------------------");
    }
}