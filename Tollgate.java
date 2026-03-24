class Tollgate {

    String name;
    String highway;
    String location;
    double fee;
    int lanes;

    Tollgate(String name, String highway, String location, double fee, int lanes) {
        this.name = name;
        this.highway = highway;
        this.location = location;
        this.fee = fee;
        this.lanes = lanes;
    }

    void printInfo() {
        System.out.println("Name: " + name +
                           ", Highway: " + highway +
                           ", Location: " + location +
                           ", Fee: " + fee +
                           ", Lanes: " + lanes);
    }
}