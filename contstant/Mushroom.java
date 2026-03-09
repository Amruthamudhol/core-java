class Mushroom {
    float sporeDensity;
    Forest forest;
    MushroomHabitat habitat;

    Mushroom(float sporeDensity, Forest forest, MushroomHabitat habitat) {
        this.sporeDensity = sporeDensity;
        this.forest = forest;
        this.habitat = habitat;
    }

    void printInfo() {
        System.out.println("Spore Density: " + this.sporeDensity);

        if (this.forest != null) {
            System.out.println("Forest Name: " + this.forest.name);
        } else {
            System.out.println("Forest is null");
        }

        if (this.habitat != null) {
            System.out.println("Mushroom Habitat: " + this.habitat);
        } else {
            System.out.println("Habitat is null");
        }

        System.out.println("-----------------------");
    }
}