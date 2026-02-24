class ShoeLace {

    String brand;
    String color;
    double length;
    String material;
    double price;
    String type;
    boolean isElastic;
    String shoeType;
    String originCountry;
    int quantity;

    ShoeLace(String brand, String color, double length, String material,
             double price, String type, boolean isElastic,
             String shoeType, String originCountry, int quantity) {

        this.brand = brand;
        this.color = color;
        this.length = length;
        this.material = material;
        this.price = price;
        this.type = type;
        this.isElastic = isElastic;
        this.shoeType = shoeType;
        this.originCountry = originCountry;
        this.quantity = quantity;
    }
}