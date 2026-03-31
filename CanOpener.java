class CanOpener extends Opener {

    boolean electric;
    String bladeType;
    double weight;
    boolean safetyLock;
    String color;

    void showCanOpener() {
        displayDetails();
        System.out.println("Electric: " + electric);
        System.out.println("Blade Type: " + bladeType);
        System.out.println("Weight: " + weight);
        System.out.println("Safety Lock: " + safetyLock);
        System.out.println("Color: " + color);
    }
}