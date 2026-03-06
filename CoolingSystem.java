class CoolingSystem {

    String coolingType;
    boolean active;

    CoolingSystem(String coolingType, boolean active) {
        this.coolingType = coolingType;
        this.active = active;
    }

    void printDetails() {
        System.out.println("Cooling System Details:");
        System.out.println("Cooling Type: " + this.coolingType);
        System.out.println("Active: " + this.active);
    }
}