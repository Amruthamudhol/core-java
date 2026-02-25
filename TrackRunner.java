class TrackRunner {

    public static void main(String[] args) {

        Track t1 = new Track();
        System.out.println(t1.name);
        System.out.println(t1.length);
        System.out.println(t1.location);
        System.out.println(t1.type);
        System.out.println(t1.isIndoor);
        System.out.println("------------------");

        Track t2 = new Track("Silverstone");
        System.out.println(t2.name);
        System.out.println(t2.length);
        System.out.println(t2.location);
        System.out.println(t2.type);
        System.out.println(t2.isIndoor);
        System.out.println("------------------");

        Track t3 = new Track("Metro Rail", 120.5);
        System.out.println(t3.name);
        System.out.println(t3.length);
        System.out.println(t3.location);
        System.out.println(t3.type);
        System.out.println(t3.isIndoor);
        System.out.println("------------------");

        Track t4 = new Track("National Stadium", 2.5, "Delhi");
        System.out.println(t4.name);
        System.out.println(t4.length);
        System.out.println(t4.location);
        System.out.println(t4.type);
        System.out.println(t4.isIndoor);
        System.out.println("------------------");

        Track t5 = new Track("Formula Circuit", 5.8, "Mumbai", "Racing");
        System.out.println(t5.name);
        System.out.println(t5.length);
        System.out.println(t5.location);
        System.out.println(t5.type);
        System.out.println(t5.isIndoor);
        System.out.println("------------------");

        Track t6 = new Track("Olympic Track", 1.0, "Bangalore", "Athletic", true);
        System.out.println(t6.name);
        System.out.println(t6.length);
        System.out.println(t6.location);
        System.out.println(t6.type);
        System.out.println(t6.isIndoor);
        System.out.println("------------------");
    }
}