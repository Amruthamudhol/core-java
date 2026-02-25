class CarromRunner {

    public static void main(String[] args) {

        Carrom c1 = new Carrom();
        System.out.println(c1.boardMaterial);
        System.out.println(c1.boardColor);
        System.out.println(c1.size);
        System.out.println(c1.numberOfCoins);
        System.out.println(c1.hasStriker);
        System.out.println("------------------");

        Carrom c2 = new Carrom("Wood");
        System.out.println(c2.boardMaterial);
        System.out.println(c2.boardColor);
        System.out.println(c2.size);
        System.out.println(c2.numberOfCoins);
        System.out.println(c2.hasStriker);
        System.out.println("------------------");

        Carrom c3 = new Carrom("Plywood", "Brown");
        System.out.println(c3.boardMaterial);
        System.out.println(c3.boardColor);
        System.out.println(c3.size);
        System.out.println(c3.numberOfCoins);
        System.out.println(c3.hasStriker);
        System.out.println("------------------");

        Carrom c4 = new Carrom("Hardwood", "Light Brown", 3.5);
        System.out.println(c4.boardMaterial);
        System.out.println(c4.boardColor);
        System.out.println(c4.size);
        System.out.println(c4.numberOfCoins);
        System.out.println(c4.hasStriker);
        System.out.println("------------------");

        Carrom c5 = new Carrom("Premium Wood", "Dark Brown", 4.0, 19);
        System.out.println(c5.boardMaterial);
        System.out.println(c5.boardColor);
        System.out.println(c5.size);
        System.out.println(c5.numberOfCoins);
        System.out.println(c5.hasStriker);
        System.out.println("------------------");

        Carrom c6 = new Carrom("Tournament Wood", "Classic", 4.5, 19, true);
        System.out.println(c6.boardMaterial);
        System.out.println(c6.boardColor);
        System.out.println(c6.size);
        System.out.println(c6.numberOfCoins);
        System.out.println(c6.hasStriker);
        System.out.println("------------------");
    }
}