class MuseumCreator {

    static Museum createMuseum() {
        Museum museum = new Museum();
        System.out.println("Museum Name: " + museum.name);
        System.out.println("Location: " + museum.location);
        System.out.println("-----------------------");
        return museum;
    }

    static Museum createMuseum(String name) {
        Museum museum = new Museum(name);
        System.out.println("Museum Name: " + museum.name);
        System.out.println("Location: " + museum.location);
        System.out.println("-----------------------");
        return museum;
    }

    static Museum createMuseum(String name, String location) {
        Museum museum = new Museum(name, location);
        System.out.println("Museum Name: " + museum.name);
        System.out.println("Location: " + museum.location);
        System.out.println("-----------------------");
        return museum;
    }
}