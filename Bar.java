class Bar {

    String name;
    String location;
    int capacity;

    void serve() {
        System.out.println("Serving drinks ...");
    }

    void clean() {
        System.out.println("Cleaning the bar...");
    }

    void displayBarInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity);
    }
}