class BeerRunner {
    public static void main(String[] args) {

        Brewery b1 = new Brewery("GoldenBrew");
        Brewery b2 = new Brewery("CraftBarrel");
        Brewery b3 = new Brewery("UrbanBrew");
        Brewery b4 = new Brewery("RiverSideBrew");

        Beer beer1 = new Beer(25.5, b1, FermentationType.ALE);
        Beer beer2 = new Beer(30.2, b2, FermentationType.LAGER);
        Beer beer3 = new Beer(28.7, b3, FermentationType.STOUT);
        Beer beer4 = new Beer(32.1, b4, FermentationType.PILSNER);

        beer1.printInfo();
        beer2.printInfo();
        beer3.printInfo();
        beer4.printInfo();
    }
}