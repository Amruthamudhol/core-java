class Controller {

    String model;
    int voltage;

    Controller(String model, int voltage) {
        this.model = model;
        this.voltage = voltage;
    }

    void printDetails() {
        System.out.println("Controller Details:");
        System.out.println("Model: " + this.model);
        System.out.println("Voltage: " + this.voltage + "V");
    }
}