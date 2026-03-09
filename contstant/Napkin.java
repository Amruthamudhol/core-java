class Napkin {
    int quantity;       
    Brand brand;        
    NapkinType type;    

    Napkin(int quantity, Brand brand, NapkinType type) {
        this.quantity = quantity;
        this.brand = brand;
        this.type = type;
    }

    void printInfo() {
        System.out.println("Napkin Quantity: " + this.quantity);
        if (this.brand != null) {
            System.out.println("Brand Name: " + this.brand.name);
        } else {
            System.out.println("Brand is null");
        }

        if (this.type != null) {
            System.out.println("Napkin Type: " + this.type);
        } else {
            System.out.println("Napkin Type is null");
        }

        System.out.println("----------------------");
    }
}