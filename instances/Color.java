class Color {

    String colorName;
    int quantity;

    Color(String colorName, int quantity) {
        this.colorName = colorName;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Color: " + colorName + " Quantity: " + quantity);
    }
}