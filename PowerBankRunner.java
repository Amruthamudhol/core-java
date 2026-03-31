public class PowerBankRunner {

    public static void main(String[] args) {

        WirelessPowerBank w1 = new WirelessPowerBank();
        WirelessPowerBank w2 = new WirelessPowerBank();

        w1.brand = "Anker";
        w1.capacity = 10000;
        w1.price = 2499;
        w1.wirelessCharging = true;
        w1.chargingDistance = 5;
        w1.compatibility = "Android & iPhone";
        w1.weight = 220;
        w1.magneticSupport = true;

        w1.charge();
        w1.showLevel();
        w1.showWirelessPowerBank();

        System.out.println("-------------");

        w2.brand = "Spigen";
        w2.capacity = 15000;
        w2.price = 2999;
        w2.wirelessCharging = true;
        w2.chargingDistance = 6;
        w2.compatibility = "iPhone";
        w2.weight = 250;
        w2.magneticSupport = false;

        w2.charge();
        w2.showLevel();
        w2.showWirelessPowerBank();

        System.out.println("-------------");

        PowerBank p1 = new WirelessPowerBank();
        PowerBank p2 = new WirelessPowerBank();

        p1.brand = "Mi";
        p1.capacity = 20000;
        p1.price = 1999;

        p1.charge();
        p1.showLevel();
        p1.showPowerBank();

        System.out.println("-------------");

        p2.brand = "Realme";
        p2.capacity = 10000;
        p2.price = 1299;

        p2.charge();
        p2.showLevel();
        p2.showPowerBank();

        System.out.println("-------------");

        PowerBank p3 = new PowerBank();
        PowerBank p4 = new PowerBank();

        p3.brand = "Boat";
        p3.capacity = 8000;
        p3.price = 999;

        p3.charge();
        p3.showLevel();
        p3.showPowerBank();

        System.out.println("-------------");

        p4.brand = "Syska";
        p4.capacity = 9000;
        p4.price = 1099;

        p4.charge();
        p4.showLevel();
        p4.showPowerBank();
    }
}