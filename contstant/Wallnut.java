class Wallnut {
    int weight;
    Supplier supplier;
    WalnutType type;

    Wallnut(int weight, Supplier supplier, WalnutType type) {
        this.weight = weight;
        this.supplier = supplier;
        this.type = type;
    }

    void printInfo() {
        System.out.println("Wallnut Weight: " + this.weight);

        if (this.supplier != null) {
            System.out.println("Supplier Name: " + this.supplier.name);
        } else {
            System.out.println("Supplier is null");
        }

        if (this.type != null) {
            System.out.println("Wallnut Type: " + this.type);
        } else {
            System.out.println("Wallnut Type is null");
        }

        System.out.println("----------------------");
    }
}