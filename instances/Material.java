class Material {

    String materialName;
    int weight;

    Material(String materialName, int weight) {
        this.materialName = materialName;
        this.weight = weight;
    }

    void display() {
        System.out.println("Material: " + this.materialName + " Weight: " + this.weight);
    }
}