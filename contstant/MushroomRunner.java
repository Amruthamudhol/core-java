class MushroomRunner {
    public static void main(String[] args) {

        Forest f1 = new Forest("EvergreenForest");
        Forest f2 = new Forest("RainForest");
        Forest f3 = new Forest("HillForest");
        Forest f4 = new Forest("DeepWoods");

        Mushroom m1 = new Mushroom(2.3f, f1, MushroomHabitat.WOODLAND);
        Mushroom m2 = new Mushroom(3.1f, f2, MushroomHabitat.GRASSLAND);
        Mushroom m3 = new Mushroom(2.8f, f3, MushroomHabitat.SWAMPLAND);
        Mushroom m4 = new Mushroom(3.5f, f4, MushroomHabitat.MOUNTAIN);

        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        m4.printInfo();
    }
}