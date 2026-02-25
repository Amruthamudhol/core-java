class Strawberry {

    String color;
    double weight;          
    String taste;
    double pricePerKg;
    boolean isFresh;

    Strawberry() {
        System.out.println("Constructor 1: Default");
    }

 
    Strawberry(String color) {
        this.color = color;
    }

    Strawberry(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    Strawberry(String color, double weight, String taste) {
        this.color = color;
        this.weight = weight;
        this.taste = taste;
    }

    Strawberry(String color, double weight, String taste, double pricePerKg) {
        this.color = color;
        this.weight = weight;
        this.taste = taste;
        this.pricePerKg = pricePerKg;
    }

    Strawberry(String color, double weight, String taste, double pricePerKg, boolean isFresh) {
        this.color = color;
        this.weight = weight;
        this.taste = taste;
        this.pricePerKg = pricePerKg;
        this.isFresh = isFresh;
    }
}