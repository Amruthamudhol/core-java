class CocktailBar extends Bar {

    boolean liveMusic;
    int cocktailVarieties;
    boolean danceFloor;
    String famousDrink;
    double entryFee;

    void showCocktailBar() {
        displayBarInfo();
        System.out.println("Live Music: " + liveMusic);
        System.out.println("Cocktail Varieties: " + cocktailVarieties);
        System.out.println("Dance Floor: " + danceFloor);
        System.out.println("Famous Drink: " + famousDrink);
        System.out.println("Entry Fee: " + entryFee);
    }
}