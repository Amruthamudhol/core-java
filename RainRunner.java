class RainRunner {

    public static void main(String[] args) {

        Rain r1 = new Rain();
        System.out.println(r1.type);
        System.out.println(r1.intensity);
        System.out.println(r1.season);
        System.out.println(r1.duration);
        System.out.println(r1.isHeavy);
        System.out.println("------------------");

        Rain r2 = new Rain("Drizzle");
        System.out.println(r2.type);
        System.out.println(r2.intensity);
        System.out.println(r2.season);
        System.out.println(r2.duration);
        System.out.println(r2.isHeavy);
        System.out.println("------------------");

        Rain r3 = new Rain("Shower", 5.5);
        System.out.println(r3.type);
        System.out.println(r3.intensity);
        System.out.println(r3.season);
        System.out.println(r3.duration);
        System.out.println(r3.isHeavy);
        System.out.println("------------------");

        Rain r4 = new Rain("Thunderstorm", 8.2, "Monsoon");
        System.out.println(r4.type);
        System.out.println(r4.intensity);
        System.out.println(r4.season);
        System.out.println(r4.duration);
        System.out.println(r4.isHeavy);
        System.out.println("------------------");

        Rain r5 = new Rain("Cyclonic", 9.5, "Winter", 3.5);
        System.out.println(r5.type);
        System.out.println(r5.intensity);
        System.out.println(r5.season);
        System.out.println(r5.duration);
        System.out.println(r5.isHeavy);
        System.out.println("------------------");

        Rain r6 = new Rain("Cloudburst", 10.0, "Monsoon", 2.0, true);
        System.out.println(r6.type);
        System.out.println(r6.intensity);
        System.out.println(r6.season);
        System.out.println(r6.duration);
        System.out.println(r6.isHeavy);
        System.out.println("------------------");
    }
}