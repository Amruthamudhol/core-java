class Temperature1 {

    double degree;
    String unit;

    Temperature1(double degree, String unit) {
        this.degree = degree;
        this.unit = unit;
    }

    void printDetails() {
        System.out.println("Temperature: " + this.degree);
        System.out.println("Unit: " + this.unit);
    }
}