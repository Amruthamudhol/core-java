class  ChickenRunner {
    public static void main(String[] args) {

        FarmChicken c1 = new FarmChicken("Leghorn", 1, true, 2.5, 'A', 280);

        FarmChicken c2 = new FarmChicken("Broiler", 2, false, 3.2, 'B', 0);

        FarmChicken c3 = new FarmChicken("Rhode Island Red", 1, true, 2.8, 'A', 250);

        c1.display();
        c2.display();
        c3.display();
    }
}