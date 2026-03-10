class ServerRunner {

    public static void main(String[] args) {

        int[] ports = new int[3];
        ports[0] = 5051;
        ports[1] = 5050;
        ports[2] = 5052;

        ProcessUnit[] processUnit  = new ProcessUnit[3];

        ProcessUnit p1 = new ProcessUnit("AuthService", 500);
        ProcessUnit p2 = new ProcessUnit("DataEngine", 350);
        ProcessUnit p3 = new ProcessUnit("CacheManager", 420);

        processUnit[0] = p1;
        processUnit[1] = p2;
        processUnit[2] = p3;

        Server coreNode = new Server(ports, processUnit);

        coreNode.revealStatus();
    }
}