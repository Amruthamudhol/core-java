class Light {

    String type;
    int watt;

    Light(String type, int watt) {
        this.type = type;
        this.watt = watt;
    }

    void printDetails() {
        System.out.println("Light Type: " + this.type);
        System.out.println("Wattage: " + this.watt);
    }
}