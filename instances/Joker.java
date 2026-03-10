class Joker {

    double[] laughLevels;
    Trick[] trickList;

    Joker(double[] laughLevels, Trick[] trickList) {
        this.laughLevels = laughLevels;
        this.trickList = trickList;
    }

    void info() {

        System.out.println("Laugh Levels:");

        if (laughLevels != null) {

            System.out.println("Total Laugh Scores: " + this.laughLevels.length);

            for (double level : laughLevels) {
                System.out.println("Laugh Score: " + level);
            }
        }

        System.out.println("Trick Details:");

        if (trickList != null) {

            System.out.println("Total Tricks: " + this.trickList.length);

            for (Trick trick : trickList) {
                trick.display();
            }
        }
    }
}