public class GameBoardRunner {

    public static void main(String[] args) {

        ElectronicGameBoard g1 = new ElectronicGameBoard();
        ElectronicGameBoard g2 = new ElectronicGameBoard();

        g1.brand = "Sony";
        g1.material = "Fiber";
        g1.price = 2500;
        g1.hasDisplay = true;
        g1.players = 6;
        g1.powerSource = "Rechargeable Battery";
        g1.weight = 2.0;
        g1.soundEffects = true;

        g1.startGame();
        g1.endGame();
        g1.showElectronicGameBoard();

        System.out.println("-------------");

        g2.brand = "Nintendo";
        g2.material = "Plastic";
        g2.price = 1800;
        g2.hasDisplay = true;
        g2.players = 4;
        g2.powerSource = "USB Power";
        g2.weight = 1.3;
        g2.soundEffects = false;

        g2.startGame();
        g2.endGame();
        g2.showElectronicGameBoard();

        System.out.println("-------------");

        GameBoard gb1 = new ElectronicGameBoard();
        GameBoard gb2 = new ElectronicGameBoard();

        gb1.brand = "Mattel";
        gb1.material = "Wood";
        gb1.price = 900;

        gb1.startGame();
        gb1.endGame();
        gb1.showGameBoard();

        System.out.println("-------------");

        gb2.brand = "Parker";
        gb2.material = "Cardboard";
        gb2.price = 650;

        gb2.startGame();
        gb2.endGame();
        gb2.showGameBoard();

        System.out.println("-------------");

        GameBoard gb3 = new GameBoard();
        GameBoard gb4 = new GameBoard();

        gb3.brand = "Classic";
        gb3.material = "Paper";
        gb3.price = 300;

        gb3.startGame();
        gb3.endGame();
        gb3.showGameBoard();

        System.out.println("-------------");

        gb4.brand = "PlayTime";
        gb4.material = "Plastic";
        gb4.price = 450;

        gb4.startGame();
        gb4.endGame();
        gb4.showGameBoard();
    }
}