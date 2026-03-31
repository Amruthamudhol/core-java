class Factory {

    String name;
    String location;
    int workers;

    void beginWork() {
        System.out.println("Work started");
    }

    void endWork() {
        System.out.println("Work ended");
    }

    void displayFactoryDetails() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Workers: " + workers);
    }
}