class AirCarrier extends Carrier {

    String airline;
    int altitude;
    boolean cargoSupport;
    String destination;
    String fuelType;

    void displayAirCarrier() {
        showCarrierInfo();
        System.out.println("Airline: " + airline);
        System.out.println("Altitude: " + altitude);
        System.out.println("Cargo Support: " + cargoSupport);
        System.out.println("Destination: " + destination);
        System.out.println("Fuel Type: " + fuelType);
    }
}