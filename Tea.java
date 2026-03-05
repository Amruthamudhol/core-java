class Tea {

    String brand;
    double price;
    boolean organic;
    int quantity;
    String flavor;

    Ingredient ingredient;
    Cup cup;
    Shop shop;
    Manufacturer2 manufacturer;
    Temperature temperature;

    Tea(String brand, double price, boolean organic, int quantity, String flavor,
        Ingredient ingredient, Cup cup, Shop shop, Manufacturer2 manufacturer, Temperature temperature) {

        this.brand = brand;
        this.price = price;
        this.organic = organic;
        this.quantity = quantity;
        this.flavor = flavor;

        this.ingredient = ingredient;
        this.cup = cup;
        this.shop = shop;
        this.manufacturer = manufacturer;
        this.temperature = temperature;
    }
}