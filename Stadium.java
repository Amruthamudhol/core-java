class Stadium {

    String name;
    int capacity;

    Stadium() {
        this.name = "Unknown Stadium";
        this.capacity = 0;
    }

    Stadium(String name) {
        this.name = name;
        this.capacity = 40000;
    }

    Stadium(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}