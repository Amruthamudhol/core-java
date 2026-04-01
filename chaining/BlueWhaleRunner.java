class BlueWhaleRunner {
    public static void main(String[] args) {

        GiantBlueWhale w1 =  new GiantBlueWhale("Pacific", 25, true, 30.5, 'A', 150000);

        GiantBlueWhale w2 = new GiantBlueWhale("Atlantic", 18, true, 28.0, 'B', 140000);

        GiantBlueWhale w3 = new GiantBlueWhale("Indian", 22, true, 29.3, 'A', 145000);

        w1.display();
        w2.display();
        w3.display();
    }
}