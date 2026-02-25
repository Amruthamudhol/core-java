class Carrom {

    String boardMaterial;
    String boardColor;
    double size;          
    int numberOfCoins;
    boolean hasStriker;

    Carrom() {
        System.out.println("Constructor 1: Default");
    }

    Carrom(String boardMaterial) {
        this.boardMaterial = boardMaterial;
    }

    Carrom(String boardMaterial, String boardColor) {
        this.boardMaterial = boardMaterial;
        this.boardColor = boardColor;
    }

    Carrom(String boardMaterial, String boardColor, double size) {
        this.boardMaterial = boardMaterial;
        this.boardColor = boardColor;
        this.size = size;
    }

    Carrom(String boardMaterial, String boardColor, double size, int numberOfCoins) {
        this.boardMaterial = boardMaterial;
        this.boardColor = boardColor;
        this.size = size;
        this.numberOfCoins = numberOfCoins;
    }

    Carrom(String boardMaterial, String boardColor, double size, int numberOfCoins, boolean hasStriker) {
        this.boardMaterial = boardMaterial;
        this.boardColor = boardColor;
        this.size = size;
        this.numberOfCoins = numberOfCoins;
        this.hasStriker = hasStriker;
    }
}