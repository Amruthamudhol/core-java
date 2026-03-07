class Zoo {

    String zooName;
    String location;

    Zoo(String zooName, String location) {
        this.zooName = zooName;
        this.location = location;
    }

    void printDetails() {
        System.out.println("Zoo Details:");
        System.out.println("Zoo Name: " + this.zooName);
        System.out.println("Location: " + this.location);
    }
}