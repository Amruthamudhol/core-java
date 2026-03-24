class Cap {

    String brand;
    String color;
    String material;
    String size;
    int warranty;

    Cap(String brand, String color,String material, String size,  int warranty) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.size = size;
        this.warranty = warranty;
		
    }
	
	 void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Warranty: " + warranty + " months");
        System.out.println("-------------------------");
    }
	
}