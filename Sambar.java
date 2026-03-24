class Sambar {

    String type;
    String region;
    int spiceLevel;
    double quantity;
	String mainIngredient;
   

    Sambar(String type, String region, int spiceLevel,  double quantity,String mainIngredient) {
        this.type = type;
        this.mainIngredient = mainIngredient;
        this.spiceLevel = spiceLevel;
        this.region = region;
        this.quantity = quantity;
    }

    void displayInfo() {
        System.out.println("Type: " + type +
                           ", Main Ingredient: " + mainIngredient +
                           ", Spice Level: " + spiceLevel +
                           ", Region: " + region +
                           ", Quantity: " + quantity);
    }
}