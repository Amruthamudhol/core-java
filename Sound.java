class Sound {

    String type;
    int volume;
    boolean loud;
    double frequency;
    String tone;

    Sound(String type, int volume, boolean loud, double frequency, String tone) {
        this.type = type;
        this.volume = volume;
        this.loud = loud;
        this.frequency = frequency;
        this.tone = tone;
    }

    void printDetails() {
        System.out.println("Sound Type: " + this.type);
        System.out.println("Volume: " + this.volume);
        System.out.println("Loud: " + this.loud);
        System.out.println("Frequency: " + this.frequency);
        System.out.println("Tone: " + this.tone);
    }
}