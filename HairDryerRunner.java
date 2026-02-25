class HairDryerRunner {

    public static void main(String[] args) {

        HairDryer h1 = new HairDryer();
        System.out.println(h1.brand);
        System.out.println(h1.color);
        System.out.println(h1.power);
        System.out.println(h1.price);
        System.out.println(h1.isPortable);
        System.out.println("------------------");

        HairDryer h2 = new HairDryer("Philips");
        System.out.println(h2.brand);
        System.out.println(h2.color);
        System.out.println(h2.power);
        System.out.println(h2.price);
        System.out.println(h2.isPortable);
        System.out.println("------------------");

        HairDryer h3 = new HairDryer("Nova", "Black");
        System.out.println(h3.brand);
        System.out.println(h3.color);
        System.out.println(h3.power);
        System.out.println(h3.price);
        System.out.println(h3.isPortable);
        System.out.println("------------------");

        HairDryer h4 = new HairDryer("Panasonic", "White", 1200);
        System.out.println(h4.brand);
        System.out.println(h4.color);
        System.out.println(h4.power);
        System.out.println(h4.price);
        System.out.println(h4.isPortable);
        System.out.println("------------------");

        HairDryer h5 = new HairDryer("Havells", "Blue", 1500, 2499.0);
        System.out.println(h5.brand);
        System.out.println(h5.color);
        System.out.println(h5.power);
        System.out.println(h5.price);
        System.out.println(h5.isPortable);
        System.out.println("------------------");

        HairDryer h6 = new HairDryer("Syska", "Red", 1800, 2999.0, true);
        System.out.println(h6.brand);
        System.out.println(h6.color);
        System.out.println(h6.power);
        System.out.println(h6.price);
        System.out.println(h6.isPortable);
        System.out.println("------------------");
    }
}