class ZooCreator {

    static void getZoo() {
        System.out.println("Will create a new Zoo");

        Zoo zoo = new Zoo("Nisarga Zoo");

        System.out.println("Zoo name: " + zoo.name);
        System.out.println("Zoo created...");
    }

    static void getZoo(String name) {
        System.out.println("Creating a new Zoo with name: " + name);

        Zoo zoo = new Zoo(name);

        System.out.println("Zoo name: " + zoo.name);
        System.out.println("Zoo created using name arg");
    }

    static void getZoo(String name, String location) {
        System.out.println("Creating Zoo with name and location: " + name + ", " + location);

        Zoo zoo = new Zoo(name, location);

        System.out.println("Zoo name: " + zoo.name);
        System.out.println("Zoo location: " + zoo.location);
        System.out.println("Zoo created using name and location args");
    }
}