class NapkinRunner {
    public static void main(String[] args) {

        Brand brand1 = new Brand("SoftCare");
        Brand brand2 = new Brand("CleanPlus");

        Napkin n1 = new Napkin(100, brand1, NapkinType.PAPER);
        Napkin n2 = new Napkin(200, brand2, NapkinType.CLOTH);
        Napkin n3 = new Napkin(150, null, NapkinType.TISSUE);
        Napkin n4 = new Napkin(120, brand1, NapkinType.COTTON);

        n1.printInfo();
        n2.printInfo();
        n3.printInfo();
        n4.printInfo();
    }
}