class StadiumCreator {

    static void createStadium() {
        Stadium stadium = new Stadium();
        System.out.println("Stadium Name: " + stadium.name);
        System.out.println("Capacity: " + stadium.capacity);
        System.out.println("----------------------");
    }

    static void createStadium(String name) {
        Stadium stadium = new Stadium(name);
        System.out.println("Stadium Name: " + stadium.name);
        System.out.println("Capacity: " + stadium.capacity);
        System.out.println("----------------------");
    }

    static void createStadium(String name, int capacity) {
        Stadium stadium = new Stadium(name, capacity);
        System.out.println("Stadium Name: " + stadium.name);
        System.out.println("Capacity: " + stadium.capacity);
        System.out.println("----------------------");
    }
}