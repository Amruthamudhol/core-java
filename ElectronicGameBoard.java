class ElectronicGameBoard extends GameBoard {

    boolean hasDisplay;
    int players;
    String powerSource;
    double weight;
    boolean soundEffects;

    void showElectronicGameBoard() {
        showGameBoard();
        System.out.println("Has Display: " + hasDisplay);
        System.out.println("Players: " + players);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Weight: " + weight);
        System.out.println("Sound Effects: " + soundEffects);
    }
}