class JokerRunner {

    public static void main(String[] args) {

        double[] laughs = new double[3];
        laughs[0] = 8.7;
        laughs[1] = 7.7;
        laughs[2] = 9.2;

        Trick[] tricks = new Trick[3];

        Trick t1 = new Trick("Card Trick", 3);
        Trick t2 = new Trick("Magic Hat", 4);
        Trick t3 = new Trick("Ball Juggling", 2);

        tricks[0] = t1;
        tricks[1] = t2;
        tricks[2] = t3;

        Joker joker = new Joker(laughs, tricks);

        joker.info();
    }
}