class AnalogClock extends Clock {

    String shape;
    boolean hasSecondHand;
    String Color;
    int size;
    boolean hasGlassCover;

    void showAnalogDetails() {
        System.out.println("Analog Clock Details:");
        System.out.println("Shape: " + shape);
        System.out.println("Second Hand: " + hasSecondHand);
        System.out.println(" Color: " + Color);
        System.out.println("Size: " + size);
        System.out.println("Glass Cover: " + hasGlassCover);
    }
}