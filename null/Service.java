class Service {

    String serviceType;
    int duration;

    Service(String serviceType, int duration) {
        this.serviceType = serviceType;
        this.duration = duration;
    }

    void printDetails() {
        System.out.println("Service Type: " + serviceType);
        System.out.println("Duration: " + duration);
    }
}