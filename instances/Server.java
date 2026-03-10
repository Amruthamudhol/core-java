class Server {

    int[] portMatrix;
    ProcessUnit[] daemonCluster;

    Server(int[] portMatrix, ProcessUnit[] daemonCluster) {
        this.portMatrix = portMatrix;
        this.daemonCluster = daemonCluster;
    }

    void revealStatus() {

        System.out.println("Server Port Matrix:");

        if (portMatrix != null) {

            System.out.println("Total Ports: " + this.portMatrix.length);

            for (int port : portMatrix) {
                System.out.println("Active Port: " + port);
            }
        }

        System.out.println("Daemon Cluster Details:");

        if (daemonCluster != null) {

            System.out.println("Total Processes: " + this.daemonCluster.length);

            for (ProcessUnit unit : daemonCluster) {
                unit.display();
            }
        }
    }
}