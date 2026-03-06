class Ingredient {

    String type;
    int amount;

    Ingredient(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    void printDetails() {
        System.out.println("Ingredient Type: " + this.type);
        System.out.println("Amount: " + this.amount);
    }
}