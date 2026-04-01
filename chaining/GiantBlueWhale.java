class GiantBlueWhale extends BlueWhale {

    double length;
    char sizeCategory;
    long weight;

    GiantBlueWhale(String ocean, int age, boolean endangered,      double length, char sizeCategory, long weight) {

        super(ocean, age, endangered);
        this.length = length;
        this.sizeCategory = sizeCategory;
        this.weight = weight;
    }

    void display() {
        System.out.println("Ocean: " + ocean);
        System.out.println("Age: " + age);
        System.out.println("Endangered: " + endangered);
        System.out.println("Length: " + length);
        System.out.println("Size Category: " + sizeCategory);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------");
    }
}