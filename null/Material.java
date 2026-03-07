class Material {

    String type;
    double weight;
    boolean strong;
    int durability;
    String color;

    Material(String type, double weight, boolean strong, int durability, String color) {
        this.type = type;
        this.weight = weight;
        this.strong = strong;
        this.durability = durability;
        this.color = color;
    }

    void printDetails() {
        System.out.println("Material Type: " + this.type);
        System.out.println("Weight: " + this.weight);
        System.out.println("Strong: " + this.strong);
        System.out.println("Durability: " + this.durability);
        System.out.println("Color: " + this.color);
    }
}