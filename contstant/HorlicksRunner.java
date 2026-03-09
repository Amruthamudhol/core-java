class HorlicksRunner {
    public static void main(String[] args) {

        Manufacturer m1 = new Manufacturer("GSK");
        Manufacturer m2 = new Manufacturer("HUL");

        Horlicks h1 = new Horlicks(250.50, m1, Flavor.CLASSIC);
        Horlicks h2 = new Horlicks(300.75, m2, Flavor.CHOCOLATE);
        Horlicks h3 = new Horlicks(275.00, null, Flavor.VANILLA);
        Horlicks h4 = new Horlicks(320.40, m1, Flavor.BADAM);

        h1.printInfo();
        h2.printInfo();
        h3.printInfo();
        h4.printInfo();
    }
}