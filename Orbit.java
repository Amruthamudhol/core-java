class Orbit {

    String planet;
    double distance;
    String shape;

    void revolve() {
        System.out.println("Orbiting around planet");
    }

    void calculateSpeed() {
        System.out.println("Calculating orbital speed");
    }

    void showOrbit() {
        System.out.println("Planet: " + planet);
        System.out.println("Distance: " + distance);
        System.out.println("Shape: " + shape);
    }
}