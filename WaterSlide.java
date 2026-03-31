class WaterSlide extends Slide {

    boolean waterFlow;
    int capacity;
    String location;
    String color;
    String safetyLevel;

    void showDetails() {
        displayInfo();
        System.out.println("Water Flow: " + waterFlow);
        System.out.println("Capacity: " + capacity);
        System.out.println("Location: " + location);
        System.out.println("Color: " + color);
        System.out.println("Safety Level: " + safetyLevel);
    }
}