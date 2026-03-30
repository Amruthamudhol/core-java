class Carrier {

    String name;
    String mode;
    int capacity;

    void dispatch() {
        System.out.println("Carrier dispatched");
    }

    void halt() {
        System.out.println("Carrier halted");
    }

    void showCarrierInfo() {
        System.out.println("Name: " + name);
        System.out.println("Mode: " + mode);
        System.out.println("Capacity: " + capacity);
    }
}