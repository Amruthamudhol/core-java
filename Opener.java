class Opener {

    String type;
    String material;
    double price;

    void unlock() {
        System.out.println("Unlocking using opener");
    }

    void release() {
        System.out.println("Releasing the lid");
    }

    void displayDetails() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
    }
}