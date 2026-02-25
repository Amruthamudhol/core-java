class StrawberryRunner {

    public static void main(String[] args) {

        Strawberry s1 = new Strawberry();
        System.out.println(s1.color);
        System.out.println(s1.weight);
        System.out.println(s1.taste);
        System.out.println(s1.pricePerKg);
        System.out.println(s1.isFresh);
        System.out.println("------------------");

        Strawberry s2 = new Strawberry("Red");
        System.out.println(s2.color);
        System.out.println(s2.weight);
        System.out.println(s2.taste);
        System.out.println(s2.pricePerKg);
        System.out.println(s2.isFresh);
        System.out.println("------------------");

        Strawberry s3 = new Strawberry("Dark Red", 15.5);
        System.out.println(s3.color);
        System.out.println(s3.weight);
        System.out.println(s3.taste);
        System.out.println(s3.pricePerKg);
        System.out.println(s3.isFresh);
        System.out.println("------------------");

        Strawberry s4 = new Strawberry("Light Red", 18.0, "Sweet");
        System.out.println(s4.color);
        System.out.println(s4.weight);
        System.out.println(s4.taste);
        System.out.println(s4.pricePerKg);
        System.out.println(s4.isFresh);
        System.out.println("------------------");

        Strawberry s5 = new Strawberry("Bright Red", 20.0, "Sweet & Sour", 250.0);
        System.out.println(s5.color);
        System.out.println(s5.weight);
        System.out.println(s5.taste);
        System.out.println(s5.pricePerKg);
        System.out.println(s5.isFresh);
        System.out.println("------------------");

        Strawberry s6 = new Strawberry("Premium Red", 22.5, "Very Sweet", 300.0, true);
        System.out.println(s6.color);
        System.out.println(s6.weight);
        System.out.println(s6.taste);
        System.out.println(s6.pricePerKg);
        System.out.println(s6.isFresh);
        System.out.println("------------------");
    }
}