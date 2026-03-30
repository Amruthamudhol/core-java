public class OpenerRunner {

    public static void main(String[] args) {

        CanOpener c1 = new CanOpener();
        CanOpener c2 = new CanOpener();

        c1.type = "Electric";
        c1.material = "Steel";
        c1.price = 450;
        c1.electric = true;
        c1.bladeType = "Sharp";
        c1.weight = 1.2;
        c1.safetyLock = true;
        c1.color = "Black";

        c1.unlock();
        c1.release();
        c1.showCanOpener();

        System.out.println("-------------");

        c2.type = "Manual";
        c2.material = "Iron";
        c2.price = 220;
        c2.electric = false;
        c2.bladeType = "Standard";
        c2.weight = 0.8;
        c2.safetyLock = false;
        c2.color = "Silver";

        c2.unlock();
        c2.release();
        c2.showCanOpener();

        System.out.println("-------------");

        Opener o1 = new CanOpener();
        Opener o2 = new CanOpener();

        o1.type = "Jar";
        o1.material = "Plastic";
        o1.price = 150;

        o1.unlock();
        o1.release();
        o1.displayDetails();

        System.out.println("-------------");

        o2.type = "Bottle";
        o2.material = "Steel";
        o2.price = 180;

        o2.unlock();
        o2.release();
        o2.displayDetails();

        System.out.println("-------------");

        Opener o3 = new Opener();
        Opener o4 = new Opener();

        o3.type = "Basic";
        o3.material = "Iron";
        o3.price = 60;

        o3.unlock();
        o3.release();
        o3.displayDetails();

        System.out.println("-------------");

        o4.type = "Simple";
        o4.material = "Aluminum";
        o4.price = 75;

        o4.unlock();
        o4.release();
        o4.displayDetails();
    }
}