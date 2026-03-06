class Manufacturer1 {

    String name;
    String country;

    Manufacturer1(String name, String country) {
        this.name = name;
        this.country = country;
    }

    void printDetails() {
        System.out.println("Manufacturer Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Country: " + this.country);
    }
}