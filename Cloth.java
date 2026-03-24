class Cloth {

    String brand;
    String type;
	String size;
    String color;
    int price;

    Cloth(String brand,  String type, String size, String color,int price) {
        this.brand = brand;
        this.type = type;
        this.size = size;
		this.color = color;
        this.price = price;
    }

    void printInfo() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Type: " + type + ", Size: " + size +
                           ", Price: " + price);
    }
}