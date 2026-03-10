class DryFruit {

    String dryFruitName;
    int quantity;

    DryFruit(String dryFruitName, int quantity) {
        this.dryFruitName = dryFruitName;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Dry Fruit: " + this.dryFruitName + " Quantity: " + this.quantity);
    }
}