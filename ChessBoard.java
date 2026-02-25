class ChessBoard {

    String material;
    String color;
    int size;              
    int numberOfSquares;
    boolean isFoldable;

 
    ChessBoard() {
        System.out.println("Constructor 1: Default");
    }

    ChessBoard(String material) {
        this.material = material;
    }

    ChessBoard(String material, String color) {
        this.material = material;
        this.color = color;
    }

    ChessBoard(String material, String color, int size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    ChessBoard(String material, String color, int size, int numberOfSquares) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.numberOfSquares = numberOfSquares;
    }

    ChessBoard(String material, String color, int size, int numberOfSquares, boolean isFoldable) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.numberOfSquares = numberOfSquares;
        this.isFoldable = isFoldable;
    }
}