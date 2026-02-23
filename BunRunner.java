class BunRunner {
    public static void main(String[] args) {

        Bun bun1 = new Bun();
        bun1.type = "Sweet Bun";
        bun1.price = 15.50;
        bun1.brand = "DailyFresh";
        bun1.weight = 100.5;
        bun1.shape = "Round";
        bun1.fresh = true;
        bun1.quantity = 20;
        bun1.ingredients = new String[]{"Flour", "Sugar", "Yeast"};
        bun1.outlets = new String[]{"CityMart", "BakeHouse"};
        bun1.color = "Brown";

   
        Bun bun2 = new Bun();
        bun2.type = "Milk Bun";
        bun2.price = 20.00;
        bun2.brand = "SuperBake";
        bun2.weight = 120.0;
        bun2.shape = "Oval";
        bun2.fresh = false;
        bun2.quantity = 15;
        bun2.ingredients = new String[]{"Flour", "Milk", "Butter", "Yeast"};
        bun2.outlets = new String[]{"SuperMarket", "FoodZone"};
        bun2.color = "Golden";

        System.out.println("Bun 1 Details:");
        System.out.println("Type: " + bun1.type);
        System.out.println("Price: " + bun1.price);
        System.out.println("Brand: " + bun1.brand);
        System.out.println("Weight: " + bun1.weight);
        System.out.println("Shape: " + bun1.shape);
        System.out.println("Fresh: " + bun1.fresh);
        System.out.println("Quantity: " + bun1.quantity);
        System.out.println("Color: " + bun1.color);

        System.out.println("Ingredients:");
        for (int i = 0; i < bun1.ingredients.length; i++) {
            System.out.println(bun1.ingredients[i]);
        }

        System.out.println("Outlets:");
        for (int i = 0; i < bun1.outlets.length; i++) {
            System.out.println(bun1.outlets[i]);
        }

        System.out.println("-----------------------------");


        System.out.println("Bun 2 Details:");
        System.out.println("Type: " + bun2.type);
        System.out.println("Price: " + bun2.price);
        System.out.println("Brand: " + bun2.brand);
        System.out.println("Weight: " + bun2.weight);
        System.out.println("Shape: " + bun2.shape);
        System.out.println("Fresh: " + bun2.fresh);
        System.out.println("Quantity: " + bun2.quantity);
        System.out.println("Color: " + bun2.color);

        System.out.println("Ingredients:");
        for (int i = 0; i < bun2.ingredients.length; i++) {
            System.out.println(bun2.ingredients[i]);
        }

        System.out.println("Outlets:");
        for (int i = 0; i < bun2.outlets.length; i++) {
            System.out.println(bun2.outlets[i]);
        }
    }
}