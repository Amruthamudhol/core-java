class ChessBoardRunner {

    public static void main(String[] args) {

        ChessBoard cb1 = new ChessBoard();
        System.out.println(cb1.material);
        System.out.println(cb1.color);
        System.out.println(cb1.size);
        System.out.println(cb1.numberOfSquares);
        System.out.println(cb1.isFoldable);
        System.out.println("------------------");

        ChessBoard cb2 = new ChessBoard("Wood");
        System.out.println(cb2.material);
        System.out.println(cb2.color);
        System.out.println(cb2.size);
        System.out.println(cb2.numberOfSquares);
        System.out.println(cb2.isFoldable);
        System.out.println("------------------");

        ChessBoard cb3 = new ChessBoard("Plastic", "Black & White");
        System.out.println(cb3.material);
        System.out.println(cb3.color);
        System.out.println(cb3.size);
        System.out.println(cb3.numberOfSquares);
        System.out.println(cb3.isFoldable);
        System.out.println("------------------");

        ChessBoard cb4 = new ChessBoard("Marble", "Brown", 18);
        System.out.println(cb4.material);
        System.out.println(cb4.color);
        System.out.println(cb4.size);
        System.out.println(cb4.numberOfSquares);
        System.out.println(cb4.isFoldable);
        System.out.println("------------------");

        ChessBoard cb5 = new ChessBoard("Glass", "Transparent", 20, 64);
        System.out.println(cb5.material);
        System.out.println(cb5.color);
        System.out.println(cb5.size);
        System.out.println(cb5.numberOfSquares);
        System.out.println(cb5.isFoldable);
        System.out.println("------------------");

        ChessBoard cb6 = new ChessBoard("Wood", "Classic", 22, 64, true);
        System.out.println(cb6.material);
        System.out.println(cb6.color);
        System.out.println(cb6.size);
        System.out.println(cb6.numberOfSquares);
        System.out.println(cb6.isFoldable);
        System.out.println("------------------");
    }
}