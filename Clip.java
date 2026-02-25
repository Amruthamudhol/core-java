class Clip {

    String material;
    String color;
    double length;
    double price;
    boolean isReusable;

    Clip() {
        System.out.println("Constructor 1: Default");
    }

    Clip(String material) {
        this.material = material;
    }

    Clip(String material, String color) {
        this.material = material;
        this.color = color;
    }

    Clip(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }

    Clip(String material, String color, double length, double price) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.price = price;
    }

    Clip(String material, String color, double length, double price, boolean isReusable) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.price = price;
        this.isReusable = isReusable;
    }
}