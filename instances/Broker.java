class Broker {

    boolean[] dealStatus;
    Client[] clientList;

    Broker(boolean[] dealStatus, Client[] clientList) {
        this.dealStatus = dealStatus;
        this.clientList = clientList;
    }

    void info() {

        System.out.println("Deal Status:");

        if (dealStatus != null) {

            System.out.println("Total Deals: " + this.dealStatus.length);

            for (boolean status : dealStatus) {
                System.out.println("Deal Completed: " + status);
            }
        }

        System.out.println("Client Details:");

        if (clientList != null) {

            System.out.println("Total Clients: " + this.clientList.length);

            for (Client client : clientList) {
                client.display();
            }
        }
    }
}