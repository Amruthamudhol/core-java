class Slide {

    String type;
    String material;
    int height;

    void activate() {
        System.out.println("Slide activated");
    }

    void deactivate() {
        System.out.println("Slide deactivated");
    }

    void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Height: " + height);
    }
}