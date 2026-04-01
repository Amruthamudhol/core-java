class ButterRunner {
    public static void main(String[] args) {

        DairyButter b1 = new DairyButter("Amul", 55.5, true, 500, 'A', 90);
		
        DairyButter b2 = new DairyButter("Nandini", 52.0, false, 250, 'B', 60);

        DairyButter b3 = new DairyButter("Milky Mist", 60.0, true, 1000, 'A', 120);

        b1.display();
        b2.display();
        b3.display();
    }
}