class Water {

    String type;
    double temperature;

    Water(String type, double temperature) {
        this.type = type;
        this.temperature = temperature;
    }

    void printDetails() {
        System.out.println("Water Type: " + this.type);
        System.out.println("Temperature: " + this.temperature);
    }
}