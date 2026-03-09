class PumpkinRunner {
    public static void main(String[] args) {

        Farm farm1 = new Farm("GreenField");
        Farm farm2 = new Farm("SunFarm");

        Pumpkin p1 = new Pumpkin(3.5, farm1, PumpkinColor.ORANGE);
        Pumpkin p2 = new Pumpkin(4.2, farm2, PumpkinColor.GREEN);
        Pumpkin p3 = new Pumpkin(2.8, null, PumpkinColor.YELLOW);
        Pumpkin p4 = new Pumpkin(5.0, farm1, PumpkinColor.WHITE);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
    }
}