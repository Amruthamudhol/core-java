class CoffeeRunner {

    public static void main(String[] args) {

        Coffee coffee = new Coffee("Bru", 120.50);

        System.out.println("Coffee brand: " + coffee.brandName);
        System.out.println("Coffee price: " + coffee.price);
    }
}