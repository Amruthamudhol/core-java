class Cup {

    String material;
    int capacity;

    Cup(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    void printDetails() {
        System.out.println("Cup Material: " + this.material);
        System.out.println("Cup Capacity: " + this.capacity);
    }
}