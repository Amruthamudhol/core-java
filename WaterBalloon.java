class WaterBalloon extends Balloon {

    int waterCapacity;
    boolean reusable;
    String useType;
    String brand;
    int quantity;

    void showWaterBalloon() {
        System.out.println("Water Capacity: " + waterCapacity);
        System.out.println("Reusable: " + reusable);
        System.out.println("Use Type: " + useType);
        System.out.println("Brand: " + brand);
        System.out.println("Quantity: " + quantity);
    }
}