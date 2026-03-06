class Size {

    int height;
    int width;
    int diameter;
    boolean portable;
    String unit;

    Size(int height, int width, int diameter, boolean portable, String unit) {
        this.height = height;
        this.width = width;
        this.diameter = diameter;
        this.portable = portable;
        this.unit = unit;
    }

    void printDetails() {
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Diameter: " + this.diameter);
        System.out.println("Portable: " + this.portable);
        System.out.println("Unit: " + this.unit);
    }
}