class Statue {

    String name;
    String location;
    String material;
    double height;
    int year;

    Statue(String name, String location, String material, double height, int year) {
        this.name = name;
        this.location = location;
        this.material = material;
        this.height = height;
        this.year = year;
    }

    void printInfo() {
        System.out.println("Name: " + name +
                           ", Location: " + location +
                           ", Material: " + material +
                           ", Height: " + height +
                           ", Year: " + year);
    }
}