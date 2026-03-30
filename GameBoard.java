class GameBoard {

    String brand;
    String material;
    double price;

    void startGame() {
        System.out.println("Game started");
    }

    void endGame() {
        System.out.println("Game ended");
    }

    void showGameBoard() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
    }
}