class Trick {

    String trickName;
    int difficulty;

    Trick(String trickName, int difficulty) {
        this.trickName = trickName;
        this.difficulty = difficulty;
    }

    void display() {
        System.out.println("Trick: " + this.trickName + " Difficulty: " + this.difficulty);
    }
}