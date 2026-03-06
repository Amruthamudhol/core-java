class Equipment {

    String type;
    int quantity;

    Equipment(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    void printDetails() {
        System.out.println("Equipment Details:");
        System.out.println("Type: " + this.type);
        System.out.println("Quantity: " + this.quantity);
    }
}