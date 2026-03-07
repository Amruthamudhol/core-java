class Stadium {

    String stadiumName;
    int capacity;

    Stadium(String stadiumName, int capacity) {
        this.stadiumName = stadiumName;
        this.capacity = capacity;
    }

    void printDetails() {
        System.out.println("Stadium Details:");
        System.out.println("Stadium Name: " + this.stadiumName);
        System.out.println("Capacity: " + this.capacity);
    }
}