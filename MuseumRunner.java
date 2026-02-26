class MuseumRunner {

    public static void main(String[] args) {

        MuseumCreator.createMuseum();
        MuseumCreator.createMuseum("National Museum");
        MuseumCreator.createMuseum("Louvre Museum", "Paris");
    }
}