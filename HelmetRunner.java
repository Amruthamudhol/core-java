class HelmetRunner {

    public static void main(String[] args) {

        Helmet helmet = new Helmet("Vega", "Black", 1200.0);

        System.out.println("Brand: " + helmet.brand);
        System.out.println("Color: " + helmet.color);
        System.out.println("Price: " + helmet.price);
    }
}