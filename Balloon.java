class Balloon {

    String color;
    String material;
    double price;

    void fillAir() {
        System.out.println("Balloon filled");
    }

    void burst() {
        System.out.println("Balloon burst");
    }

    void showBalloon() {
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
    }
}