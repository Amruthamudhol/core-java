class Habitat {

    String place;
    double area;

    Habitat(String place, double area) {
        this.place = place;
        this.area = area;
    }

    void printDetails() {
        System.out.println("Habitat details:");
        System.out.println("Place: " + this.place);
        System.out.println("Area: " + this.area);
    }
}