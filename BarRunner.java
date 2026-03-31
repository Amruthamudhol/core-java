public class BarRunner {

    public static void main(String[] args) {

        CocktailBar c1 = new CocktailBar();
        CocktailBar c2 = new CocktailBar();

        c1.name = "Night Vibes";
        c1.location = "Bangalore";
        c1.capacity = 50;
        c1.liveMusic = true;
        c1.cocktailVarieties = 25;
        c1.danceFloor = true;
        c1.famousDrink = "Mojito";
        c1.entryFee = 500;

        c1.serve();
        c1.clean();
        c1.showCocktailBar();

        System.out.println("-------------");

        c2.name = "Sky Lounge";
        c2.location = "Mumbai";
        c2.capacity = 70;
        c2.liveMusic = false;
        c2.cocktailVarieties = 18;
        c2.danceFloor = true;
        c2.famousDrink = "Martini";
        c2.entryFee = 750;

        c2.serve();
        c2.clean();
        c2.showCocktailBar();

        System.out.println("-------------");

        Bar b1 = new CocktailBar();
        Bar b2 = new CocktailBar();

        b1.name = "City Bar";
        b1.location = "Pune";
        b1.capacity = 40;

        b1.serve();
        b1.clean();
        b1.displayBarInfo();

        System.out.println("-------------");

        b2.name = "Ocean Bar";
        b2.location = "Goa";
        b2.capacity = 60;

        b2.serve();
        b2.clean();
        b2.displayBarInfo();

        System.out.println("-------------");

        Bar b3 = new Bar();
        Bar b4 = new Bar();

        b3.name = "Local Spot";
        b3.location = "Hubli";
        b3.capacity = 20;

        b3.serve();
        b3.clean();
        b3.displayBarInfo();

        System.out.println("-------------");

        b4.name = "Town Bar";
        b4.location = "Belgavi";
        b4.capacity = 25;

        b4.serve();
        b4.clean();
        b4.displayBarInfo();
    }
}