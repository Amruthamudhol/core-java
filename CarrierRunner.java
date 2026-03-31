public class CarrierRunner {

    public static void main(String[] args) {

        AirCarrier c1 = new AirCarrier();
        AirCarrier c2 = new AirCarrier();

        c1.name = "SkyLift";
        c1.mode = "Air";
        c1.capacity = 200;
        c1.airline = "Air India";
        c1.altitude = 35000;
        c1.cargoSupport = true;
        c1.destination = "Delhi";
        c1.fuelType = "Jet Fuel";

        c1.dispatch();
        c1.displayAirCarrier();
        c1.halt();

        System.out.println("-------------");

        c2.name = "CloudMover";
        c2.mode = "Air";
        c2.capacity = 180;
        c2.airline = "Indigo";
        c2.altitude = 33000;
        c2.cargoSupport = false;
        c2.destination = "Mumbai";
        c2.fuelType = "Jet Fuel";

        c2.dispatch();
        c2.displayAirCarrier();
        c2.halt();

        System.out.println("==== Parent type, subclass objects ===");

        Carrier ca1 = new AirCarrier();
        Carrier ca2 = new AirCarrier();

        ca1.name = "QuickFly";
        ca1.mode = "Air";
        ca1.capacity = 150;

        ca1.dispatch();
        ca1.showCarrierInfo();
        ca1.halt();

        System.out.println("-------------");

        ca2.name = "SpeedWing";
        ca2.mode = "Air";
        ca2.capacity = 170;

        ca2.dispatch();
        ca2.showCarrierInfo();
        ca2.halt();

        System.out.println("==== Parent class instances ====");

        Carrier p1 = new Carrier();
        Carrier p2 = new Carrier();

        p1.name = "RoadMove";
        p1.mode = "Road";
        p1.capacity = 80;

        p1.dispatch();
        p1.showCarrierInfo();
        p1.halt();

        System.out.println("-------------");

        p2.name = "SeaLoad";
        p2.mode = "Sea";
        p2.capacity = 300;

        p2.dispatch();
        p2.showCarrierInfo();
        p2.halt();
    }
}