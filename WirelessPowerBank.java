class WirelessPowerBank extends PowerBank {

    boolean wirelessCharging;
    int chargingDistance;
    String compatibility;
    double weight;
    boolean magneticSupport;

    void showWirelessPowerBank() {
        showPowerBank();
        System.out.println("Wireless Charging: " + wirelessCharging);
        System.out.println("Charging Distance: " + chargingDistance);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Weight: " + weight);
        System.out.println("Magnetic Support: " + magneticSupport);
    }
}