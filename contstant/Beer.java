class Beer {
    double bitternessIndex;
    Brewery brewery;
    FermentationType fermentation;

    Beer(double bitternessIndex, Brewery brewery, FermentationType fermentation) {
        this.bitternessIndex = bitternessIndex;
        this.brewery = brewery;
        this.fermentation = fermentation;
    }

    void printInfo() {
        System.out.println("Bitterness Index: " + this.bitternessIndex);

        if (this.brewery != null) {
            System.out.println("Brewery Name: " + this.brewery.name);
        } else {
            System.out.println("Brewery is null");
        }

        if (this.fermentation != null) {
            System.out.println("Fermentation Type: " + this.fermentation);
        } else {
            System.out.println("Fermentation Type is null");
        }

        System.out.println("-----------------------");
    }
}
