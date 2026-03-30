class SatelliteOrbit extends Orbit {

    String satelliteName;
    boolean artificial;
    double period;
    String agency;
    boolean active;

    void showSatelliteOrbit() {
        showOrbit();
        System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Artificial: " + artificial);
        System.out.println("Period: " + period);
        System.out.println("Agency: " + agency);
        System.out.println("Active: " + active);
    }
}