class Museum {

    String name;
    String location;

    Museum() {
        this.name = "Unknown Museum";
        this.location = "Unknown Location";
    }

    Museum(String name) {
        this.name = name;
        this.location = "India";
    }

    Museum(String name, String location) {
        this.name = name;
        this.location = location;
    }
}