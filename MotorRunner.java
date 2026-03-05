class MotorRunner {

    public static void main(String[] args) {

        Battery1 battery = new Battery1("Lithium", 5000);
        Controller controller = new Controller("CTRL-X", 220);
        CoolingSystem coolingSystem = new CoolingSystem("Air Cooling", true);
        Manufacturer1 manufacturer = new Manufacturer1("Bosch", "Germany");
        Warranty1 warranty = new Warranty1(3, true);

        Motor motor = new Motor("Bosch", 1500, 25000.0, true, "Electric",
                battery, controller, coolingSystem, manufacturer, warranty);

        System.out.println("Motor Brand: " + motor.brand);
        System.out.println("Power: " + motor.power);
        System.out.println("Price: " + motor.price);
        System.out.println("Automatic: " + motor.automatic);
        System.out.println("Type: " + motor.type);

        System.out.println("Battery Type: " + motor.battery.batteryType);
        System.out.println("Controller Model: " + motor.controller.model);
        System.out.println("Cooling System: " + motor.coolingSystem.coolingType);
        System.out.println("Manufacturer: " + motor.manufacturer.name);
        System.out.println("Warranty Years: " + motor.warranty.years);
    }
}