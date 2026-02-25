class ClipRunner {

    public static void main(String[] args) {

        Clip c1 = new Clip();
        System.out.println(c1.material);
        System.out.println(c1.color);
        System.out.println(c1.length);
        System.out.println(c1.price);
        System.out.println(c1.isReusable);
        System.out.println("------------------");

        Clip c2 = new Clip("Metal");
        System.out.println(c2.material);
        System.out.println(c2.color);
        System.out.println(c2.length);
        System.out.println(c2.price);
        System.out.println(c2.isReusable);
        System.out.println("------------------");

        Clip c3 = new Clip("Plastic", "Black");
        System.out.println(c3.material);
        System.out.println(c3.color);
        System.out.println(c3.length);
        System.out.println(c3.price);
        System.out.println(c3.isReusable);
        System.out.println("------------------");

        Clip c4 = new Clip("Steel", "Silver", 5.5);
        System.out.println(c4.material);
        System.out.println(c4.color);
        System.out.println(c4.length);
        System.out.println(c4.price);
        System.out.println(c4.isReusable);
        System.out.println("------------------");

        Clip c5 = new Clip("Iron", "Grey", 6.0, 10.5);
        System.out.println(c5.material);
        System.out.println(c5.color);
        System.out.println(c5.length);
        System.out.println(c5.price);
        System.out.println(c5.isReusable);
        System.out.println("------------------");

        Clip c6 = new Clip("Alloy", "Gold", 7.0, 20.0, true);
        System.out.println(c6.material);
        System.out.println(c6.color);
        System.out.println(c6.length);
        System.out.println(c6.price);
        System.out.println(c6.isReusable);
        System.out.println("------------------");
    }
}
