class Instrument {

    String name;
    String type;
    int price;

    void startPlay() {
        System.out.println("Instrument started");
    }

    void stopPlay() {
        System.out.println("Instrument stopped");
    }

    void showInstrument() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }
}