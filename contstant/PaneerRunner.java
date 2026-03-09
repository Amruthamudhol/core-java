class PaneerRunner {
    public static void main(String[] args) {

        Dairy d1 = new Dairy("MilkyFarm");
        Dairy d2 = new Dairy("PureDairy");
        Dairy d3 = new Dairy("FreshMilk");
        Dairy d4 = new Dairy("VillageDairy");

        Paneer p1 = new Paneer(18.5, d1, PaneerTexture.SOFT);
        Paneer p2 = new Paneer(20.0, d2, PaneerTexture.FIRM);
        Paneer p3 = new Paneer(19.2, d3, PaneerTexture.CRUMBLY);
        Paneer p4 = new Paneer(21.3, d4, PaneerTexture.SMOOTH);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
    }
}