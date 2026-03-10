class Client {

    String clientName;
    int investment;

    Client(String clientName, int investment) {
        this.clientName = clientName;
        this.investment = investment;
    }

    void display() {
        System.out.println("Client: " + this.clientName + " Investment: " + this.investment);
    }
}