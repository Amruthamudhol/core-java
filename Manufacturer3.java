class Manufacturer3 {

    String name;
    String country;
    int establishedYear;
    boolean certified;
    String founder;

    Manufacturer3(String name, String country, int establishedYear, boolean certified, String founder) {
        this.name = name;
        this.country = country;
        this.establishedYear = establishedYear;
        this.certified = certified;
        this.founder = founder;
    }

    void printDetails() {
        System.out.println("Manufacturer Name: " + this.name);
        System.out.println("Country: " + this.country);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Certified: " + this.certified);
        System.out.println("Founder: " + this.founder);
    }
}