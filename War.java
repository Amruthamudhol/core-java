class War {

    String warName;
    int year;
    String country;

    void declareWar() {
        System.out.println("War declared");
    }

    void ceaseFire() {
        System.out.println("Ceasefire announced");
    }

    void showWarDetails() {
        System.out.println("War Name: " + warName);
        System.out.println("Year: " + year);
        System.out.println("Country: " + country);
    }
}