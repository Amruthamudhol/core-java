class BrokerRunner {

    public static void main(String[] args) {

        boolean[] deals = new boolean[3];
        deals[0] = true;
        deals[1] = false;
        deals[2] = true;

        Client[] clients = new Client[3];

        Client c1 = new Client("Alice", 58000);
        Client c2 = new Client("Amar", 85000);
        Client c3 = new Client("Andy", 70000);

        clients[0] = c1;
        clients[1] = c2;
        clients[2] = c3;

        Broker broker = new Broker(deals, clients);

        broker.info();
    }
}