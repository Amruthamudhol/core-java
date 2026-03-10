class Ink {

    String color;
    int quantity;

    Ink(String color, int quantity) {
        this.color = color;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Ink Color: " + this.color + " Quantity: " + this.quantity);
    }
}