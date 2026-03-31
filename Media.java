class Media {

    String title;
    String creator;
    int duration; 

    void play() {
        System.out.println("Media is playing");
    }

    void pause() {
        System.out.println("Media is paused");
    }

    void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Creator: " + creator);
        System.out.println("Duration: " + duration + " minutes");
    }
}