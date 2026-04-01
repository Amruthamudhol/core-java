class ShawarmaRunner {
    public static void main(String[] args) {

        SpecialShawarma s1 = new SpecialShawarma(1, "Chicken Shawarma", true, 120.5, 'L', 450);

        SpecialShawarma s2 = new SpecialShawarma(2, "Paneer Shawarma", false, 100.0, 'M', 380);

        SpecialShawarma s3 =  new SpecialShawarma(3, "Veg Shawarma", false, 90.0, 'S', 300);

        s1.display();
        s2.display();
        s3.display();
    }
}