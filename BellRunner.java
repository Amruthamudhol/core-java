class BellRunner {

    public static void main(String[] args) {

        Sound sound = new Sound("Ring", 80, true, 2000.5, "High");
        Material material = new Material("Steel", 1.5, true, 10, "Silver");
        Size size = new Size(10, 5, 3, true, "cm");
        Manufacturer3 manufacturer = new Manufacturer3("BellCo", "India", 1995, true, "Ramesh");
        Warranty2 warranty = new Warranty2(2, "Full", true, "BellCo", 500);

        Bell bell = new Bell("TempleBell", 1200.0, false, 2, "Golden",
                sound, material, size, manufacturer, warranty);
    }
}