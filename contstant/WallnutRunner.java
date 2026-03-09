class WallnutRunner {
    public static void main(String[] args) {

        Supplier s1 = new Supplier("HealthyFoods");
        Supplier s2 = new Supplier("NutriFarm");
        Supplier s3 = new Supplier("FreshNuts");
        Supplier s4 = new Supplier("OrganicFarm");

        Wallnut w1 = new Wallnut(580, s1, WalnutType.ORGANIC);
        Wallnut w2 = new Wallnut(760, s2, WalnutType.DRY);
        Wallnut w3 = new Wallnut(650, s3, WalnutType.ROASTED);
        Wallnut w4 = new Wallnut(890, s4, WalnutType.SALTED);

        w1.printInfo();
        w2.printInfo();
        w3.printInfo();
        w4.printInfo();
    }
}