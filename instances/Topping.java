class Topping {

    String toppingName;
    int quantity;

    Topping(String toppingName, int quantity) {
        this.toppingName = toppingName;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Topping: " + this.toppingName + " Quantity: " + this.quantity);
    }
}