class ProcessUnit {

    String processName;
    int memoryUsage;

    ProcessUnit(String processName, int memoryUsage) {
        this.processName = processName;
        this.memoryUsage = memoryUsage;
    }

    void display() {
        System.out.println("Process: " + this.processName + " Memory: " + this.memoryUsage + "MB");
    }
}