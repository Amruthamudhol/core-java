public class BalloonRunner {

    public static void main(String[] args) {

        WaterBalloon wb1 = new WaterBalloon();
        WaterBalloon wb2 = new WaterBalloon();

        wb1.color = "Pink";
        wb1.material = "Rubber";
        wb1.price = 5;
        wb1.waterCapacity = 200;
        wb1.reusable = false;
        wb1.useType = "Festival";
        wb1.brand = "Splash";
        wb1.quantity = 50;

        wb1.fillAir();
        wb1.burst();
        wb1.showWaterBalloon();

        System.out.println("-------------");

        wb2.color = "Yellow";
        wb2.material = "Latex";
        wb2.price = 6;
        wb2.waterCapacity = 250;
        wb2.reusable = true;
        wb2.useType = "Holi";
        wb2.brand = "FunSplash";
        wb2.quantity = 100;

        wb2.fillAir();
        wb2.burst();
        wb2.showWaterBalloon();

        System.out.println("-------------");

        Balloon b1 = new WaterBalloon();
        Balloon b2 = new WaterBalloon();

        b1.color = "Red";
        b1.material = "Plastic";
        b1.price = 4;

        b1.fillAir();
        b1.burst();
        b1.showBalloon();

        System.out.println("-------------");

        b2.color = "Blue";
        b2.material = "Rubber";
        b2.price = 3;

        b2.fillAir();
        b2.burst();
        b2.showBalloon();

        System.out.println("-------------");

        Balloon b3 = new Balloon();
        Balloon b4 = new Balloon();

        b3.color = "green";
        b3.material = "Latex";
        b3.price = 2;

        b3.fillAir();
        b3.burst();
        b3.showBalloon();

        System.out.println("-------------");

        b4.color = "Orange";
        b4.material = "Rubber";
        b4.price = 3;

        b4.fillAir();
        b4.burst();
        b4.showBalloon();
    }
}