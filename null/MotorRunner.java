class MotorRunner {

    public static void main(String[] args) {

        Battery1 battery = null;
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

        if(motor.battery != null){
            motor.battery.printDetails();
        } 
		else 
		{
            System.out.println("Battery details not available");
        }

        if(motor.controller != null){
            motor.controller.printDetails();
        } 
		else
			{
            System.out.println("Controller details not available");
        }

        if(motor.coolingSystem != null){
            motor.coolingSystem.printDetails();
        } 
		else {
            System.out.println("Cooling system details not available");
        }

        if(motor.manufacturer != null){
            motor.manufacturer.printDetails();
        }
		else {
            System.out.println("Manufacturer details not available");
        }

        if(motor.warranty != null){
            motor.warranty.printDetails();
        }
		else {
            System.out.println("Warranty details not available");
        }
    }
}